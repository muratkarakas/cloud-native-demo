package com.eteration.cloud.demo.orderservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eteration.cloud.demo.orderservice.dto.ProductDTO;

@FeignClient("product-service")
public interface ProductServiceClient {
	
	
	@RequestMapping("/products/{id}")
	public ProductDTO readProduct(@PathVariable("id") long productId);
}
