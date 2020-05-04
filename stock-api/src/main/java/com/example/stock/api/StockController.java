package com.example.stock.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	@Value("#{environment.POD_NAME}")
	private String podName;
	
	@Value("#{environment.POD_NAMESPACE}")
	private String podNamespace;
	
	@Value("#{environment.POD_IP}")
	private String podIP;

	@GetMapping("/stock")
	public Stock greeting(@RequestParam(value = "name", defaultValue = "IBM") String name) {
		return new Stock(name, 0.00, podName, podNamespace, podIP);
	}
}
