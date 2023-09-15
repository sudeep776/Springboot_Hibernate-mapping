package com.JPA.Mapping.repositories;

import com.JPA.Mapping.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
