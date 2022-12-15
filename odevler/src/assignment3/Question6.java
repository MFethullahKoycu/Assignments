package assignment3;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
			
		
		System.out.println("Notunuzu giriniz ");
	
		int input = scan.nextInt();
		
	
		if (input<50) {
			
			System.out.println("Notunuz \"D\" ");
		}
		
		else if (input>=50 && input<60) {
			
			System.out.println("Notunuz \"C\" ");
			
		}
		
		else if (input>=60 && input<80) {
			
			System.out.println("Notunuz \"B\" ");
			
		}
		
		else {
			System.out.println("Notunuz \"A\" ");
			
		}
	}
}
		
			
		
		
	
