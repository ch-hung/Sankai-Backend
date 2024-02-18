package com.example.demo.vo;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UploadProduct {
	private String name;
	private String detail;
	private Integer price;
	private MultipartFile file;
	private String filename;
	private Integer category;
}