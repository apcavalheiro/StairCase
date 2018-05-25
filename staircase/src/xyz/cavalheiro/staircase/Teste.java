package xyz.cavalheiro.staircase;

import java.util.Scanner;

public class Teste {

	private static final Scanner scanner = new Scanner(System.in);

	static void staircase(int n) {
		for(int i=0 ; i<n ;i++){
			for(int j = 0; j <= n-i-2; j++){
				System.out.print(" ");
			}
			for(int j = n-i-1 ; j< n; j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		int n = scanner.nextInt();

		staircase(n);
	}

}
