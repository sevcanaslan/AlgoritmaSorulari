package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//girilen TL değerini USD'ye çeviren 
		Scanner scanner = new Scanner(System.in);
		System.out.println("TL miktar giriniz:");
		
		float TL =scanner.nextInt();
		float Dolar = TL/18.25f;
		
		System.out.println("Dolar:" + Dolar + "$");
	}

}
