package lesson002;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("İşlem giriniz");
		int x1 = scanner.nextInt();
		System.out.println("İki sayı giriniz");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		float Sonuc;
		if (x1==1) {
			Sonuc=a+b;
			System.out.println("Sonuç: " + Sonuc);
		}
		if (x1==2) {
			Sonuc=a-b;
			System.out.println("Sonuç: " + Sonuc);
		}
		if (x1==3) {
			Sonuc=a*b;
			System.out.println("Sonuç: " + Sonuc);
		}
		if (x1==4) {
			Sonuc=a/b;
			System.out.println("Sonuç: " + Sonuc);
		}
	}
}
