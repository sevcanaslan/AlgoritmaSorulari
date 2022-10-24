package lesson002;

import java.util.Scanner;

public class question11 {
	public static void main(String[] args) {
		//girilen 3 sayıdan en büyük olanı yazdıran program
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("3 sayı giriniz:");
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int enBuyuk = x1;
		if (enBuyuk < x2) {
			enBuyuk = x2;
			
		}
		if(enBuyuk<x3) {
			enBuyuk = x3;
		}
		System.out.println("En büyük sayı: " + enBuyuk);
	}
	
}
