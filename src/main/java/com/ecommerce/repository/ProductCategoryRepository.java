package com.ecommerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.constant.SqlConstant;
import com.ecommerce.mappers.ProductCategoryMapper;
import com.ecommerce.model.ProductCategory;

@Repository
public class ProductCategoryRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Add New Product Category.
	 * 
	 * @param productCategory
	 * @return Integer
	 */
	public Integer addNewProductCategory(ProductCategory productCategory) {
		return jdbcTemplate.update(SqlConstant.ADD_NEW_PRODUCTCATEGORY, productCategory.getCategoryId(),
				productCategory.getCategoryName());
	}

	/**
	 * Get All Product Categories
	 * 
	 * @return List<ProductCategory>
	 */
	public List<ProductCategory> findAllProductCategories() {

		List<ProductCategory> productCategories = jdbcTemplate.query(SqlConstant.GET_ALL_PRODUCT_CATEGORIES,
				new ProductCategoryMapper());

		return productCategories;
	}

	/**
	 * Find Product Category By Category Id
	 * 
	 * @param categoryId
	 * @return ProductCategory
	 */
	public ProductCategory findProductCategoryById(Integer categoryId) {
		ProductCategory productCategory = (ProductCategory) jdbcTemplate
				.queryForObject(SqlConstant.FIND_PRODUCT_CATEGORY_BY_ID, new ProductCategoryMapper(), categoryId);
		return productCategory;
	}

	/**
	 * To find Product Category By Category Id
	 * 
	 * @param categoryId
	 */
	public void deleteProductCategoryById(Integer categoryId) {
		jdbcTemplate.update(SqlConstant.DELETE_PRODUCT_CATEGORY_BY_ID, categoryId);
	}

	/**
	 * 
	 * @return Integer
	 */
	public Integer updateProductCategory(ProductCategory productCategory, Integer categoryId) {
		return jdbcTemplate.update(SqlConstant.UPDATE_PRODUCT_CATEGORY_BY_ID, productCategory.getCategoryName(),
				productCategory.getCategoryId());
	}

}
