package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ProductCategory;
import com.ecommerce.repository.ProductCategoryRepository;
/**
 * This is Implementation class for ProductCategory Service.
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public Integer addProductCategory(ProductCategory productCategory) {
		return productCategoryRepository.addNewProductCategory(productCategory);
	}

	@Override
	public List<ProductCategory> findAllProductCategories() {

		return productCategoryRepository.findAllProductCategories();
	}

	@Override
	public Integer updateProductCategory(ProductCategory productCategory, Integer categoryId) {
		return productCategoryRepository.updateProductCategory(productCategory,categoryId);
	}

	@Override
	public ProductCategory findProductCategoryById(Integer categoryId) {
		return productCategoryRepository.findProductCategoryById(categoryId);
	}

	@Override
	public void deleteProductCategoryById(Integer categoryId) {
		productCategoryRepository.deleteProductCategoryById(categoryId);

	}

}
