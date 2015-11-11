package com.polymorphism;

public class Main {
	
	public static void main(String[] args) {
		
		TradingSystem ts = new TradingSystem();
		System.out.println(ts.getDescription());
		
		DirectMarketAccessSystem dm = new DirectMarketAccessSystem();
		System.out.println(dm.getDescription());
		
		//CommodityTradingSystem ct = new CommodityTradingSystem();
		//System.out.println(ct.getDescription());
	}

}
