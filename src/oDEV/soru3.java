package oDEV;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
		
		System.out.println("Kilonuzu giriniz");
		int kilo = scanner.nextInt();
		System.out.println("Gezegen numarası giriniz");
		int gezegen = scanner.nextInt();
		if(gezegen==1) {
			float Ay = kilo*0.162f;
			System.out.println("Ay'daki kilonuz:" + Ay);
		}
		if(gezegen==2) {
			float saturn = kilo*0.92f;
			System.out.println("Satürn'deki kilonuz:" + saturn);
		}
		if(gezegen==3) {
			float Mars = kilo*0.377f;
			System.out.println("Mars'daki kilonuz:" + Mars);
		}
		if(gezegen==4) {
			float Venus = kilo*0.887f;
			System.out.println("Venüs'deki kilonuz:" + Venus);
		}
			
	}

}
