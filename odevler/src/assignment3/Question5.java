package assignment3;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bir karakter giriniz ");
		
		
		char input1 = scan.next().charAt(0);
		
		
		if ((int) input1 >= 65 && (int) input1 <= 90 || (int) input1 >= 97 && (int) input1 <= 122) {
			
			System.out.println("Girilen karakter bir harf ");
			
		}
		
		else {
			
			System.out.println("Girilen karakter bir harf degildir ");
		}
		
	}
}
