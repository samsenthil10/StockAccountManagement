package com.bridgelabz.stockaccountmanagement;

import java.util.Scanner;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Node;

public class StockPortfolio {

	private static LinkedList<Stock> stocksList = new LinkedList<Stock>();

	public static LinkedList<Stock> addStocks() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of Stocks that want to add: ");
		int count = scanner.nextInt();
		for(int index =0;index<count;index++) {
			System.out.print("Enter the name of stock: ");
			String name = scanner.next();
			System.out.print("Enter the number of shares: ");
			int numOfShares = scanner.nextInt();
			System.out.print("Enter the price for each share: ");
			double price = scanner.nextDouble();
			Stock stock = new Stock();
			stock.setName(name);
			stock.setNumberOfShares(numOfShares);
			stock.setSharePrice(price);
			Node<Stock> myStockNode = new Node<Stock>(stock);
			stocksList.appendNode(myStockNode);
		}
		scanner.close();
		return stocksList;
	}
}
