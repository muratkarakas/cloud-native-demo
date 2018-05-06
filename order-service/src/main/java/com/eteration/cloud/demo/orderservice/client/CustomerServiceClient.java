package com.eteration.cloud.demo.orderservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eteration.cloud.demo.orderservice.dto.CustomerDTO;

@FeignClient("customer-service")
public interface CustomerServiceClient {
	
	
	@RequestMapping("/customers/{id}")
	public CustomerDTO readCustomer(@PathVariable("id") long customerId);
}
