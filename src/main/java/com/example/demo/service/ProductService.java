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
	
	public Product update(Product p) {
		if (p.getName() == "" | p.getName() == null) {
			return null;
		} else if (p.getCategory() == null | p.getCategory() == -1) {
			p.setCategory(0);
			return pdi.save(p);
		} else {
			return pdi.save(p);
		}
	}
	
	public List<Product> showProducts(Integer categoryIndex) {
		if (categoryIndex == -1) {
			return pdi.queryAll();
		} else {
			return pdi.queryCategory(categoryIndex);
		}
	}
	
	public Product showProduct(Integer id) {
		return pdi.queryId(id);
	}
	
	public void delete(Integer id) {
		pdi.delete(id);
	}
}
