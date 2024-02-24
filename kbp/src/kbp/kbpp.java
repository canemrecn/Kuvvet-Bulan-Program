package kbp;

import java.util.Scanner;

public class kbpp {
	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		System.out.print("N degerini giriniz: ");
		int n = inpScanner.nextInt();
		
		System.out.print("K degerini giriniz: ");
		int k = inpScanner.nextInt();
		
		for (int i = 1; i <= k; i  *= n) {
			System.out.println(i);
		}
		
	}
}
