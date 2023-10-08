package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.ProductCategory;

/**
 * This is specification class for category activities.
 */
public interface ProductCategoryService {

	/**
	 * This method is to add new Product Category
	 * 
	 * @param productCategory
	 * @return Integer
	 */
	Integer addProductCategory(ProductCategory productCategory);

	/**
	 * This method is to find All existing Product Categories.
	 * 
	 * @return List<ProductCategory>
	 */
	List<ProductCategory> findAllProductCategories();

	/**
	 * This method is to update existing Product Category.
	 * 
	 * @param productCategory
	 * @param categoryId
	 * @return Integer
	 */
	Integer updateProductCategory(ProductCategory productCategory, Integer categoryId);

	/**
	 * This method is to find Product Category By Id.
	 * 
	 * @param categoryId
	 * @return ProductCategory
	 */
	ProductCategory findProductCategoryById(Integer categoryId);

	/**
	 * This method is to delete Existing Product Category By Id.
	 * 
	 * @param categoryId
	 */
	void deleteProductCategoryById(Integer categoryId);

}
