package com.eteration.cloud.demo.productservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "product.default")
@Component
public class ProductServiceConfig {
	private int taxRatio;

	public int getTaxRatio() {
		return taxRatio;
	}

	public void setTaxRatio(int taxRatio) {
		this.taxRatio = taxRatio;
	}
}
