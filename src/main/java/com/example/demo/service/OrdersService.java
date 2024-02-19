package com.example.demo.service;

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

	public Orders update(Orders o) {
		if (o.getStatus() == null) {
			o.setStatus(0);
		}
		return ordersRepository.save(o);
	}

	public List<Orders> getAll() {
		return ordersRepository.findAll();
	}

	public List<Orders> getCustomer(Integer customer) {
		return ordersRepository.findAllByCustomerAndStatusLessThanOrderByStatusDesc(customer, 3);
	}

	public List<Orders> sendOrders(Integer customer) {
		List<Orders> os1 = ordersRepository.findAllByCustomerAndStatus(customer, 0);
		for (int i = 0; i < os1.size(); i++) {
			nextStatus(os1.get(i).getId());
		}
		return os1;
	}
	
	public void delete(Integer id) {
		ordersRepository.deleteById(id);
	}

	public Orders nextStatus(Integer id) {
		Orders o = ordersRepository.findById(id).orElse(null);
		if (o == null) {
			return null;
		} else {
			o.setStatus(o.getStatus() + 1);
			return ordersRepository.save(o);
		}
	}
	
//	public void mergeTable(Integer table, Integer status) {
//		List<Orders> os = ordersRepository.findAllByTableAndStatus(table, status);
//	}
}