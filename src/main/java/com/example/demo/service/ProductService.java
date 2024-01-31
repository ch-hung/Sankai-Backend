package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.impl.ProductDaoImpl;
import com.example.demo.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDaoImpl pdi;
	
	public Product add(Product p) {
		if (p.getName() == "" | p.getName() == null) {
			return null;
		} else if (p.getCategory() == null | p.getCategory() == -1) {
			p.setCategory(0);
			return pdi.add(p);
		} else {
			return pdi.add(p);
		}
	}
	
	public List<Product> showProduct(Integer categoryIndex) {
		if (categoryIndex == -1) {
			return pdi.queryAll();
		} else {
			return pdi.queryCategory(categoryIndex);
		}
	}
}
