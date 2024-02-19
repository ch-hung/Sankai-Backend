package com.example.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrdersDao;
import com.example.demo.repository.OrdersRepository;

@Service
public class OrdersDaoImpl implements OrdersDao {
	@Autowired
	OrdersRepository ordersRepository;
}