package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductDao {
	// Create & Update
	Product save(Product p);
	
	// Read
	List<Product> queryAll();
	List<Product> queryCategory(Integer index);
	Product queryId(Integer id);
	
	// Delete
	void delete(Integer id);	
}
