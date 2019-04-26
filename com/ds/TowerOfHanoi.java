package com.ds;

public class TowerOfHanoi {
	public static void code() {
		recHanoi(3,'a','c','b');
	}

	static void recHanoi(int n, char s, char t, char aux) {
		if (n == 1) {
			System.out.println("move 1 from " + s + " to " + t);
			return;
		}
		recHanoi(n - 1, s, aux, t);
		System.out.println("move " + n + "from " + s + " to " + t);
		recHanoi(n - 1, aux, t, s);

	}
	//for iterative soln visit https://www.geeksforgeeks.org/iterative-tower-of-hanoi/
	//https://cs.stackexchange.com/questions/96624/how-to-solve-tower-of-hanoi-iteratively
}
