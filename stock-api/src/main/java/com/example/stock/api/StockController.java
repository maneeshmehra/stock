package com.example.stock.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@GetMapping("/stock")
	public Stock greeting(@RequestParam(value = "name", defaultValue = "IBM") String name) {
		return new Stock(name, 0.00);
	}
}
