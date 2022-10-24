package lesson002;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        System.out.println("Kontrol edilecek sayiyi giriniz:");
	        Scanner scanner = new Scanner (System.in);
	        
	       int x = scanner.nextInt();
	        
	        if (x%2 ==0)
	        {
	            System.out.println("Sayiniz çift sayidir.");
	        }
	        else 
	        {
	            System.out.println("Sayiniz tek sayidir.");
	        }
	}

}
