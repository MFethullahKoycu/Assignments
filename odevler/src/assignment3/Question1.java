package assignment3;

import java.util.Scanner;

public class Question1 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("3 tane farkli sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		
	if (sayi1>sayi2 && sayi1>sayi3) {
		
		System.out.println("en buyuk sayi " + sayi1 + " dir");
		
			
		 }
	else if (sayi2>sayi3 && sayi2>sayi1) {
		 
		 System.out.println("en buyuk sayi " + sayi2 + " dir");
		 	
	}
	else { 
		
		System.out.println("en buyuk sayi " + sayi3 + " dur");
		
		
	}
	
	
	}
}
