package com.example.demo.service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	 @Autowired
	    private ProductRepository productRepository;
	 
	 public Product addProduct(Product product, MultipartFile image) throws IOException {
	        if (image != null && !image.isEmpty()) {
	            product.setImage(image.getBytes());
	        }

	        return productRepository.save(product);
	    }

	    public Optional<Product> getProductById(int productId) {
	        return productRepository.findById(productId);
	    }

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

//	    public Product updateProduct(Integer productId, Product updatedProduct) {
//	        Product existingProduct = productRepository.findById(productId)
//	                .orElseThrow(EntityNotFoundException::new);
//
//	        // Update existing fields based on non-null values from updatedProduct
//	        if (updatedProduct.getName() != null) {
//	            existingProduct.setName(updatedProduct.getName());
//	        }
//
//	        if (updatedProduct.getManufacturing() != null) {
//	            existingProduct.setManufacturing(updatedProduct.getManufacturing());
//	        }
//
//	        // Assuming price is of type double
//	        if (updatedProduct.getPrice() != 0.0) {
//	            existingProduct.setPrice(updatedProduct.getPrice());
//	        }
//
//	        if (updatedProduct.getCategory() != null) {
//	            existingProduct.setCategory(updatedProduct.getCategory());
//	        }
//
//	        // Save the updated product
//	        return productRepository.save(existingProduct);
//	    }
	    public Product updateProduct(int productId, Product updatedProduct) {
	        Product existingProduct = productRepository.findById(productId)
	                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + productId));

	        if (updatedProduct.getName() != null) {
	            existingProduct.setName(updatedProduct.getName());
	        }

	        if (updatedProduct.getManufacturing() != null) {
	            existingProduct.setManufacturing(updatedProduct.getManufacturing());
	        }

	        if (updatedProduct.getPrice() != 0.0) {
	            existingProduct.setPrice(updatedProduct.getPrice());
	        }

	        if (updatedProduct.getCategory() != null) {
	            existingProduct.setCategory(updatedProduct.getCategory());
	        }

	        // Note: Image field is not updated

	        return productRepository.save(existingProduct);
	    }

	   public List<Product> getByCategory(String category)
		{
			return productRepository.findByCategory(category);
		}
	   
	   public byte[] getProductImage(Integer id) {
	        Product product = productRepository.findById(id).orElse(null);

	        if (product != null) {
	            return product.getImage();
	        } else {
	            return null;
	        }
	    }
	    public void deleteProduct(int productId) {
	        productRepository.deleteById(productId);
	    }

}
