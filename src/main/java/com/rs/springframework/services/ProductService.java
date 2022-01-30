package com.rs.springframework.services;

import com.rs.springframework.commands.ProductForm;
import com.rs.springframework.domain.Product;

import java.util.List;

/**
 * created by rs 1/26/2022.
 */

public interface ProductService {
    List<Product> listAll();
    Product getById(Long id);
    Product saveOrUpdate(Product product);
    void delete(Long id);
    Product saveOrUpdateProductForm(ProductForm productForm);
    void sendProductMessage(String id);
}
