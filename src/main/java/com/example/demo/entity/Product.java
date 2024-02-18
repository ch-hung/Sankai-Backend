package com.example.demo.entity;

import com.example.demo.vo.UploadProduct;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String detail;
	private Integer price;
	private String url;
	private Integer category;
	
	public Product toProduct(UploadProduct uploadProduct, String saveurl) {
		Product p = new Product();
		p.setName(uploadProduct.getName());
		p.setDetail(uploadProduct.getDetail());
		p.setPrice(uploadProduct.getPrice());
		p.setUrl(saveurl);
		p.setCategory(uploadProduct.getCategory());
		return p;
	}
}
