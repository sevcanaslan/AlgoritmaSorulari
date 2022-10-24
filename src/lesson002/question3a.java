package lesson002;

import java.util.Scanner;

public class question3a {
	public static void main(String[] args) {
		//verilen iki sayının hangisinin büyük olduğunu bulan program
		/*
		int sayi1 = 5;
		int sayi2 = 2;
		
		if(sayi1>sayi2) {
			System.out.println("Sayı 1 > Sayı 2");
		}
		else if(sayi1==sayi2){
			System.out.println( "sayılar eşittir");
			
		}
		else {
			System.out.println("sayı 2 > Sayı 1");
		}
		*/
		//girilen 2 sayıdan hangisinin büyük olduğunu bulan 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı 1:");
		System.out.println("Sayı 2:");
		int Sayi1 =scanner.nextInt();
		int Sayi2 =scanner.nextInt();
		if(Sayi1>Sayi2) {
			System.out.println("Sayı 1 > Sayı 2");
		}
		else if(Sayi1==Sayi2){
			System.out.println( "sayılar eşittir");
			
		}
		else {
			System.out.println("sayı 2 > Sayı 1");
		}
	}
}
