package com.example.demo.dao;

import com.example.demo.entity.Product;

public interface ProductDao {
	
	// Read
	Product queryId(Integer id);
}
