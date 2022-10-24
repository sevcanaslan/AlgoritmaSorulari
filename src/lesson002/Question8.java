package lesson002;

import java.util.Scanner;

public class Question8 {
public static void main(String[] args) {
	System.out.println("3 Adet kenar ölçüsü giriniz");
	Scanner scanner = new Scanner (System.in);
	int x1 = scanner.nextInt();
	int x2 = scanner.nextInt();
	int x3 = scanner.nextInt();
	  if (x1!=x2 && x1!=x3 && x2!=x3)
      {
          System.out.println("Üçgen çeşitkenardır");
      }
      else if (x1==x2 && x1==x3)
      {
          System.out.println("Üçgen eşkenardır");
          
      }
      else {
    	  System.out.println("Üçgen ikizkenardır");
      }
}
}
