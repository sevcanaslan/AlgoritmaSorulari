package oDEV;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		// girilen kilo değerini ediğer gezegenlerde kaç kiilo olduğunu bulan program  (en az 5 gezegen)
		//1- kilo değerini girdiğiimizde bbütün gezegenleri hesaplayıp yazdıracak
		
		//2- bu sefer hem kilo hem gezegen girdisi alıyorruz girdiğimiz gezegen değerine göre ekranaa yazdıracak
		
		//1- ay
		//2 saturn
		
		//input kg girin
		//input gezegen adı girin
		//output aydaki kilonuz
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Kilonuzu giriniz");
		int kilo = scanner.nextInt();
		float saturn = kilo*0.92f;
		float Venus = kilo*0.887f;
		float Mars = kilo*0.377f;
		float Ay = kilo*0.162f;
		float Uranus = kilo*0.869f;
		System.out.println("Satürn:" + saturn);
		System.out.println("Venüs:" + Venus);
		System.out.println("Mars:" + Mars);
		System.out.println("Ay:" + Ay);
		System.out.println("Uraün:" + Uranus);
	}

}
