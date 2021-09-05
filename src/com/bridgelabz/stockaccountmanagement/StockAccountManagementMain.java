package com.bridgelabz.stockaccountmanagement;

import com.bridgelabz.datastructures.LinkedList;

public class StockAccountManagementMain {

	public static void main(String[] args) {
		
		System.out.println("----------Welcome To Stock Account Management----------");
		StockAccountIF stockPortfolio = new StockAccountImpl();
		System.out.println();
		LinkedList<Stock> myStock = StockPortfolio.addStocks();
		double totalStocksValue = stockPortfolio.valueOf(myStock);
		System.out.println("Total Stock value is: " + totalStocksValue);
		System.out.println("-------------------------------------------------------");
	}
}
