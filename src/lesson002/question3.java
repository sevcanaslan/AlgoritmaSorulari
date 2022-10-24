package lesson002;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğunu biliyoruz
		//verilen ürünün ham fiyatını bulan program
		/*
		int satisFiyati=100;
		float vergisizfiyat = satisFiyati*1.18f;
		float hamFiyat = vergisizfiyat* 1.15f;
		System.out.println("hamfiyat:" + hamFiyat);
		*/
		//girilen ürünlerin ham fiyatı

		Scanner scanner = new Scanner(System.in);
		System.out.println("ürün fiyatını giriniz");
		int urunfiyat =scanner.nextInt();
		
		
		float kdvsizfiyat = urunfiyat / 1.18f;
		float ilkfiyat = kdvsizfiyat /1.5f;
		
		System.out.println("ilk fiyat =" + ilkfiyat);
				
		
	}

}
