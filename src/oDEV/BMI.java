package oDEV;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Kilonuzu giriniz");
		int kilo = scanner.nextInt();
		
		System.out.println("Boyunuzu giriniz");
		float boy = scanner.nextInt();
		
		System.out.println("Cinsiyetinizi giriniz"+"1:kadın"+"2:erkek");
		int cinsiyet = scanner.nextInt();
		
		if(cinsiyet == 1) {
			float BMI= (kilo*10000)/(boy*boy);
			System.out.println("BMI değeriniz:" + BMI);
			if (BMI<19) {
				System.out.println("Zayıfsınız");
			}
			if (BMI>=19 && BMI<=24) {
				System.out.println("Normalsiniz");
			}
			if (BMI>=25 && BMI<=30) {
				System.out.println("Şişmansınız");
			}
			if (BMI>30) {
				System.out.println("Obezsiniz");
			}
		}
		
		if(cinsiyet == 2) {
			float BMI= (kilo*10000)/(boy*boy);
			System.out.println("BMI değeriniz:" + BMI);
			if (BMI<20) {
				System.out.println("Zayıfsınız");
			}
			if (BMI>=20 && BMI<=25) {
				System.out.println("Normalsiniz");
			}
			if (BMI>=26 && BMI<=30) {
				System.out.println("Şişmansınız");
			}
			if (BMI>30) {
				System.out.println("Obezsiniz");
			}
			
			
		}
	}

}
