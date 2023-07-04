package com.greatlearning.tragetCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of trasactional days:");
		int numberOfDays = sc.nextInt();

		int transactions[] = new int[numberOfDays];
		System.out.println("Enter the transactions for " + numberOfDays + " days:");

		for (int i = 0; i < transactions.length; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(transactions));

		System.out.println("Enter number of tragets:");
		int targets = sc.nextInt();

		Target tg = new Target();
		tg.targetChecker(transactions, targets);

	}

}
