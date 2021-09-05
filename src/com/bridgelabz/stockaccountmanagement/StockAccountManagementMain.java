package com.bridgelabz.stockaccountmanagement;

import com.bridgelabz.datastructures.LinkedList;

public class StockAccountManagementMain {

	public static void main(String[] args) {
		
		System.out.println("----------Welcome To Stock Account Management----------");
		StockPortfolioIF stockPortfolio = new StockPortfolioImpl();
		System.out.println();
		LinkedList<Stock> myStock = StockPortfolio.addStocks();
		stockPortfolio.calculateValue(myStock);
		System.out.println("-------------------------------------------------------");
	}
}
