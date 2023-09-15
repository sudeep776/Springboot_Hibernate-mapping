package com.JPA.Mapping.repositories;

import com.JPA.Mapping.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {
}
