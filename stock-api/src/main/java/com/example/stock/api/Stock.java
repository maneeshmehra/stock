package com.example.stock.api;

public class Stock {

	private String ticker;
	private double price;
	private String podName;
	private String podNamespace;
	private String podIP;
	
	public Stock(String ticker, double price, String podName, String podNamespace, String podIP) {
		this.ticker = ticker;
		this.price = price;
		this.podName = podName;
		this.podNamespace = podNamespace;
		this.podIP = podIP;
	}
	
	public String getTicker() {
		return ticker;
	}
	
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String getPodName() {
		return podName;
	}

	public void setPodName(String podName) {
		this.podName = podName;
	}

	public String getPodNamespace() {
		return podNamespace;
	}

	public void setPodNamespace(String podNamespace) {
		this.podNamespace = podNamespace;
	}

	public String getPodIP() {
		return podIP;
	}

	public void setPodIP(String podIP) {
		this.podIP = podIP;
	}
}
