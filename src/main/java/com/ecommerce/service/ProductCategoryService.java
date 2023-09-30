package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.ProductCategory;

/**
 * This is specification class for category activities.
 */
public interface ProductCategoryService {

	Integer addProductCategory(ProductCategory productCategory);

	List<ProductCategory> findAllProductCategories();

	Integer updateProductCategory(ProductCategory productCategory, Integer categoryId);

	ProductCategory findProductCategoryById(Integer categoryId);

	void deleteProductCategoryById(Integer categoryId);

}
