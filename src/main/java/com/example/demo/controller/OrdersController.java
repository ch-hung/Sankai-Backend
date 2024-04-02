package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Orders;
import com.example.demo.service.OrdersService;

@CrossOrigin()
@RestController
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@PostMapping("/orders/sent")
	public void sent(@RequestBody List<Orders> ordersList) {
		ordersService.sendlist(ordersList);
		System.out.println(ordersList);
	}

}
