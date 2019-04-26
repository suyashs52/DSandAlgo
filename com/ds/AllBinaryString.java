package com.ds;

import java.util.Scanner;

public class AllBinaryString {
	static int[] arr;

	static void code() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		arr = new int[size];
		//printBinaryMaxDigit(size);
		printBinaryMinDigit(0,size);
		 

	}

	static void printBinaryMaxDigit(int n) {
		if (n < 1) {
			for(int i:arr) {
				System.out.print(i);
			}
			System.out.println();
			return;
				
		}
			
		arr[n - 1] = 0;
		
		printBinaryMaxDigit(n - 1);
		arr[n - 1] = 1;
		printBinaryMaxDigit(n - 1);
	}
	static void printBinaryMinDigit(int n,int size) {
		if (n ==size) {
			for(int i:arr) {
				System.out.print(i);
			}
			System.out.println();
			return;
				
		}
			
		arr[n ] = 0;
		
		printBinaryMinDigit(n + 1,size);
		arr[n] = 1;
		printBinaryMinDigit(n + 1,size);
	}
}
