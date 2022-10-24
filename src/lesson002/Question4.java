package lesson002;

import java.util.Scanner;

public class Question4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//verilen isim ve soy isim değerini  Hello (isim) (soyisim) şeklinde yazdıran program
		
		String isim="sevcan";
		String soyisim = "aslan";
		System.out.println("Hello " + isim + " " + soyisim);
		
		System.out.println("***********************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("İsim giriiniz:");
		String ad = scanner.next();
		System.out.println("Soyisim giriiniz:");
		String soyad = scanner.next();
		System.out.println("Hello:" + ad +" " + soyad);
	}

}
