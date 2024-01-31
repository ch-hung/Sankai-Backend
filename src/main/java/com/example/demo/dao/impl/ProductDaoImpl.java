package com.example.demo.dao.impl;

import java.util.List;

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
	public Product add(Product p) {
		return pr.save(p);
	}

	@Override
	public List<Product> queryAll() {
		return pr.findAll();
	}
	
	@Override
	public List<Product> queryCategory(Integer index) {
		return pr.findAllByCategory(index);
	}
}
