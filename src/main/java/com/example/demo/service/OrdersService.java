package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.impl.OrdersDaoImpl;
import com.example.demo.entity.Orders;
import com.example.demo.repository.OrdersRepository;

@Service
public class OrdersService {
	@Autowired
	OrdersDaoImpl ordersDaoImpl;
	@Autowired
	OrdersRepository ordersRepository;
	
	// add ONE orders
	public Orders add(Orders o) {
		return ordersRepository.save(o);
	}
	
	// send orders list from customer
	// return customer number Date().getTime()
	public Long sendlist(List<Orders> ordersList) {
		Long customer = new Date().getTime();
		for(int i = 0; i <ordersList.size(); i++) {
			ordersList.get(i).setCustomer(customer);
			ordersList.get(i).setStatus(0);
			ordersRepository.save(ordersList.get(i));
		}
		return customer;
	}
}