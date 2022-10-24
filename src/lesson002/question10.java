package lesson002;

import java.util.Scanner;

public class question10 {
	public static void main(String[] args) {
		//girilen ortalamanın harf notuna göre geçip geçmediği
		
		//90 üstü AA
		//80 -90 BB
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ortalama giriniz:");
		int ortalama = scanner.nextInt();
		if(ortalama>=90) {
			System.out.println("AA ile geçtiniz");
		}
		else if (ortalama>=80 && ortalama<90) {
			System.out.println("BB ile geçtiniz");
		}
		else if(ortalama>=70 && ortalama<80) {
			System.out.println("CC ile geçtiniz");
		}
		else if(ortalama>=60 && ortalama<70) {
			System.out.println("DD ile geçtiniz");
		}
		else {
			System.out.println("FF ile kaldınız");
		}
	}
}

