package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductDao {
	// Create
	Product add(Product p);
	
	// Read
	List<Product> queryAll();
	List<Product> queryCategory(Integer index);
}
