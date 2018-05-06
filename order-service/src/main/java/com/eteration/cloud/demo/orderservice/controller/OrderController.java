package com.eteration.cloud.demo.orderservice.controller;

import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.cloud.demo.orderservice.dto.OrderDTO;
import com.eteration.cloud.demo.orderservice.dto.OrderResult;
import com.eteration.cloud.demo.orderservice.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private OrderService orderService;
	

	
	
	@RequestMapping(method = RequestMethod.POST)
	public OrderResult createOrder(@RequestBody OrderDTO order) throws InterruptedException, ExecutionException {
		logger.info("Received order create request : {}",order);
		OrderResult or = orderService.createOrder(order);
		logger.info("Created order : {}",or.getMessage());
		return or;
	}




}
