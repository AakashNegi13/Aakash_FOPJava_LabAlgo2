package com.greatlearning.countryCurrency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of notes in your country:");
		int numberOfNotes = sc.nextInt();

		int currency[] = new int[numberOfNotes];
		System.out.println("Enter the " + numberOfNotes + " denominations:");

		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}
		System.out.println("Before sorting currency denominations: " + Arrays.toString(currency));

		SelectionSort ss = new SelectionSort();
		ss.sSort(currency);
		System.out.println("After sorting currency denominations: " + Arrays.toString(currency));

		System.out.println("Enter the amount to exchange:");
		int amount = sc.nextInt();
		Notes note = new Notes();
		note.notesCount(currency, amount);

	}

}
