package com.lorenzolemmi.ecommerce.service;

import com.lorenzolemmi.ecommerce.model.Category;
import com.lorenzolemmi.ecommerce.payload.CategoryDTO;
import com.lorenzolemmi.ecommerce.payload.CategoryResponse;


public interface CategoryService {
    CategoryResponse getAllCategories();
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long categoryId);
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
