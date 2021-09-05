package com.bridgelabz.stockaccountmanagement;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Node;

public class StockAccountImpl implements StockAccountIF {

	@Override
	public double valueOf(LinkedList<Stock> myStock) {
		
		double total=0.0;
		Node<Stock> tempNode = (Node<Stock>) myStock.head;
		System.out.println();
		while (tempNode != null) {
			Stock current = tempNode.getKey();
			double value = (current.getSharePrice() * current.getNumberOfShares());
			total=total+value;
			System.out.println("Total value for inventory " + current.getName() + " is: " + value);
			tempNode = (Node<Stock>) tempNode.getNext();
		}
		System.out.println();
		return total;
	}
}
