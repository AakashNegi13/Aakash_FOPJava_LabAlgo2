package com.greatlearning.tragetCalculator;

import java.util.Scanner;

public class Target {

	public void targetChecker(int[] transactions, int targets) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= targets; i++) {
			System.out.println("Enter traget " + i);
			int target = sc.nextInt();

			int flag = 0, sum = 0;
			for (int j = 0; j < transactions.length; j++) {
				sum += transactions[j];

				if (sum >= target) {
					flag = 1;
					System.out.println("Target ACHIVED on day " + (j + 1));
					System.out.println("Remaining balance = " + (sum - target));
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Target NOT Achived");

			}

		}

	}

}
