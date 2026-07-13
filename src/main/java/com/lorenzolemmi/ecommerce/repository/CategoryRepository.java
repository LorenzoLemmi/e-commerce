package com.lorenzolemmi.ecommerce.repository;

import com.lorenzolemmi.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String categoryName);
}
