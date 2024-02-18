package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.impl.ProductDaoImpl;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductDaoImpl productDaoImpl;
	@Autowired
	ProductRepository productRepository;

	private Integer MAX_PER_PAGE = 8;

	public Product update(Product p) {
		if (p.getName() == "" | p.getName() == null) {
			return null;
		} else if (p.getCategory() == null | p.getCategory() == -1) {
			p.setCategory(0);
			return productRepository.save(p);
		} else {
			return productRepository.save(p);
		}
	}

	public List<Product> showProducts(Integer categoryIndex) {
		if (categoryIndex == -1) {
			return productRepository.findAll();
		} else {
			return productRepository.findAllByCategory(categoryIndex);
		}
	}

	public Page<Product> showProductsPage(Integer categoryIndex, Integer page) {
		Pageable pageable = PageRequest.of(page, MAX_PER_PAGE);
		if (categoryIndex == -1) {
			return productRepository.findAll(pageable);
		} else {
			return productRepository.findAllByCategory(categoryIndex, pageable);
		}
	}

	public Product showProduct(Integer id) {
		return productDaoImpl.queryId(id);
	}

	public void delete(Integer id) {
		productRepository.deleteById(id);
	}

	public List<Page<Product>> getAllProductPage() {
		return null;
	}
}
