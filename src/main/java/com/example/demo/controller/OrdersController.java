package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Orders;
import com.example.demo.service.OrdersService;

@CrossOrigin()
@RestController
public class OrdersController {
	@Autowired
	OrdersService ordersService;

	@GetMapping("/orders/add")
	public ResponseEntity<Orders> update(@ModelAttribute("Orders") Orders o) {
		Orders newo = ordersService.update(o);
		if (newo != null) {
			return new ResponseEntity<>(newo, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.OK);
		}
	}

	// Back desk - show everything
	@GetMapping("/orders/all")
	public ResponseEntity<List<Orders>> all() {
		List<Orders> os = ordersService.getAll();
		return new ResponseEntity<>(os, HttpStatus.OK);
	}
	
	// Front desk - show unchecked orders
	@GetMapping("/orders/{customer}")
	public ResponseEntity<List<Orders>> customer(@PathVariable Integer customer) {
		List<Orders> os = ordersService.getCustomer(customer);
		return new ResponseEntity<>(os, HttpStatus.OK);
	}
	
	// Front desk - delete un-submitted orders
	// return new
	@GetMapping("/orders/d/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		ordersService.delete(id);
		return new ResponseEntity<>("delete success", HttpStatus.OK);
	}
}
