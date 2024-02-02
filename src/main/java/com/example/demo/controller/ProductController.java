package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@CrossOrigin()
@RestController
public class ProductController {
	@Autowired
	ProductService ps;

	// Back desk - create & update
	@PostMapping("/product/update")
	ResponseEntity<Product> update(@ModelAttribute("Product") Product p) {
		Product newP = ps.update(p);
		if (newP != null) {
			return new ResponseEntity<>(newP, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.OK);
		}
	}

	@GetMapping("/product/show/category/{categoryIndex}")
	ResponseEntity<List<Product>> category(@PathVariable Integer categoryIndex) {
		List<Product> p = ps.showProducts(categoryIndex);
		if (p.size() != 0) {
			return new ResponseEntity<>(p, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.OK);
		}
	}
	
	@GetMapping("/product/show/{id}")
	ResponseEntity<Product> show(@PathVariable Integer id) {
		return new ResponseEntity<>(ps.showProduct(id), HttpStatus.OK);
	}

	// Back desk - delete
	@DeleteMapping("/product/delete")
	ResponseEntity<Product> delete(Integer id) {
		ps.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
