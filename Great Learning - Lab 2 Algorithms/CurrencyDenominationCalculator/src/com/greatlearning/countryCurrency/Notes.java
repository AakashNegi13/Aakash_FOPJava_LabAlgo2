package com.greatlearning.countryCurrency;

import java.util.Iterator;

public class Notes {

	public void notesCount(int[] currency, int amount) {
		// TODO Auto-generated method stub
		int notes[] = new int[currency.length];
		int sum = 0;

		for (int i = 0; i < currency.length; i++) {
			notes[i] = amount / currency[i];
			amount %= currency[i];
			sum += notes[i];
		}
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] != 0) {
				System.out.println(notes[i] + " * " + currency[i]);
			}
		}
		System.out.println("Total number of notes are: " + sum);
	}

}
