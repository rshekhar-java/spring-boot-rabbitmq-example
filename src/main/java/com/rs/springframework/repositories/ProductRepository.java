package com.rs.springframework.repositories;

import com.rs.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * created by rs 1/26/2022.
 */
public interface ProductRepository extends CrudRepository<Product,Long> {
}
