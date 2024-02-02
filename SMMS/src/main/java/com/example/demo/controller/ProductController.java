package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.PATCH, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}, allowedHeaders = {"Content-Type", "Authorization"})
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

  
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestParam(value = "name") String name,
                                              @RequestParam(value = "manufacturing") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate manufacturing,
                                              @RequestParam(value = "price") float price,
                                              @RequestParam(value = "category") String category,
                                              @RequestParam(value = "image", required = false) MultipartFile image)
            throws IOException {

        Product newProduct = new Product();
        newProduct.setName(name);
        newProduct.setManufacturing(manufacturing);
        newProduct.setPrice(price);
        newProduct.setCategory(category);

        Product addedProduct = productService.addProduct(newProduct, image);
        return ResponseEntity.ok(addedProduct);
    }



    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable int productId) {
        Optional<Product> productOptional = productService.getProductById(productId);

        return productOptional.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


//    @PatchMapping("/{productId}")
//    public ResponseEntity<?> updateProduct(
//            @PathVariable Integer productId,
//            @RequestPart("image") MultipartFile imageFile,
//            @RequestBody Product updatedProduct) {
//        Product updated = productService.updateProduct(productId, updatedProduct);
//        return ResponseEntity.ok(updated);
//    }
    @GetMapping("/{id}/image")
	public ResponseEntity<?> getProductImage(@PathVariable Integer id) {
		byte[] image = productService.getProductImage(id);
		
		if (image != null) {
			return ResponseEntity.ok().contentType(MediaType.valueOf("image/png")).body(image);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
    @PatchMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable int productId,
            @RequestBody Product updatedProduct
    ) {
        try {
            Product result = productService.updateProduct(productId, updatedProduct);

            return ResponseEntity.ok(result);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @GetMapping("/all/{category}")
	public List<Product> getByCategory(@PathVariable String category)
	{
		return productService.getByCategory(category);
	}
    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }

}
