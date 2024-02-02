package com.example.demo.service;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.regex.Pattern;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;
	
	 private static final String SECRET_KEY = "M1y2C3o4l5l6e7g8e9P0r1o2j3e4c5tS6e7c8r9e0tK1e2y";
	 private static final long TOKEN_VALIDITY = 2 * 60 * 60 * 1000; // 2 hours in milliseconds
	    public String generateToken(int userId, String userName) {
	        // Generate a JWT token with user information
	        return Jwts.builder()
	        		.setSubject(String.valueOf(userId))
	                .claim("userName", userName)
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY))
	                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
	                .compact();
	    }

	@Transactional
	public User registerUser(User user) throws Exception {
	    // Check if a user with the same username already exists
	    if (userRepository.existsByName(user.getName())) {
	        // User with the same username already exists, throw a general exception
	        throw new Exception("User with the same username already exists");
	    }
	    
	    // Validate username: should contain at least one special character and length more than 8
	    if (!isValidUsername(user.getName())) {
	        throw new Exception("Invalid username. Username should contain at least one special character and be more than 8 characters");
	    }

	    // Validate password: length should be more than 8 characters
	    if (user.getPassword().length() <= 8) {
	        throw new Exception("Invalid password. Password should be more than 8 characters");
	    }

	    // Implement registration logic, e.g., validation, encoding password, etc.
	    if ("admin@admin".equals(user.getName()) && "admin1234".equals(user.getPassword())) {
	        user.setType("admin");
	        System.out.println("Setting user type to admin");
	    } else {
	        user.setType("customer");
	        System.out.println("Setting user type to customer");
	    }

	    // Return the registered user
	    return userRepository.save(user);
	}


    private boolean isValidUsername(String name) {
    	// Check if the username contains at least one special character and length is more than 8
        return Pattern.compile("^(?=.*[!@#$%^&*(),.?\":{}|<>])(?=.*[a-zA-Z0-9]).{8,}$").matcher(name).matches();
	}

	/*public String loginUser(String name, String password) throws AuthenticationException {
        // Validate credentials and return a token upon successful login
		  System.out.println("Login attempt with username: " + name + ", password: " + password);
        User user = userRepository.findByNameAndPassword(name, password);
        if (user != null) {
        	
        	 System.out.println("User type found: " + user.getType());
            // Your token generation logic here (you may use JWT)
            // Example: return JwtUtils.generateToken(user.getId(), user.getName());
            return "your_generated_token"; // Replace with your actual token
        } else {
            throw new AuthenticationException("Invalid credentials");
        }
    }*/
    public String loginUser(String name, String password) throws AuthenticationException {
        User user = userRepository.findByNameAndPassword(name, password);
        if (user != null) {
            String userType = determineUserType(user); // Implement your logic here
            return "{\"token\": \"" + generateToken(user.getId(), user.getName()) + "\", \"type\": \"" + userType + "\"}";
        } else {
            throw new AuthenticationException("Invalid credentials");
        }
    }

    private String determineUserType(User user) {
        // Your logic to determine user type based on user attributes
        if ("admin@admin".equals(user.getName()) && "admin1234".equals(user.getPassword())) {
        	return "admin";
        } else {
        	 return"customer";
        }
    }

    public User addUser(User user) {
        // Implement logic to add a new user
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        // Implement logic to update an existing user
        return userRepository.save(user);
    }

    public User getUserById(int userId) {
        // Implement logic to get a user by ID
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.orElse(null);
    }

    public List<User> getAllUsers() {
        // Implement logic to get all users
        return userRepository.findAll();
    }

    public void deleteUser(int userId) {
        // Implement logic to delete a user by ID
        userRepository.deleteById(userId);
    }
    
    public void logoutUser(String token) {
        // You can store the invalidated tokens in a database or in-memory store for logout tracking.
        // For simplicity, we won't implement storage here, but you should add it in a real-world scenario.

        try {
            // Parse the token to get the expiration date
            Claims claims = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
            Date expirationDate = claims.getExpiration();

            // Check if the token is not expired
            if (expirationDate.after(new Date())) {
                // Perform logout actions (e.g., store invalidated token, clean sessions, etc.)
                // In a real-world scenario, you should store the invalidated token for tracking purposes.

                System.out.println("User logged out successfully");
            } else {
                System.out.println("Token has already expired");
            }
        } catch (ExpiredJwtException e) {
            System.out.println("Token has already expired");
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }
    }
   
}
