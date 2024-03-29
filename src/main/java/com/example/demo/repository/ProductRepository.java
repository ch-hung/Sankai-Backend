package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findAllByCategory(Integer index);
	Page<Product> findAllByCategory(Integer index, Pageable pageable);
}