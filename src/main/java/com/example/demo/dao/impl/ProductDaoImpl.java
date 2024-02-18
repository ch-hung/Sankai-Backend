package com.example.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductDaoImpl implements ProductDao{
	@Autowired
	ProductRepository pr;

	@Override
	public Product queryId(Integer id) {
		return pr.findById(id).orElse(null);
	}
}
