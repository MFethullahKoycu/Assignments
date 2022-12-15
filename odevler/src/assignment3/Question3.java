package assignment3;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("herhangi bir gun isminin sadece bas harfini giriniz lutfen ");
		
		String input1 = scan.nextLine();
		
		
		switch (input1) {
		case "p":
			
			System.out.println("Pazar, Pazartesi veya Persembe ");
			break;
		
		case "s":
			
			System.out.println("Sali ");
			break;
		
		case "c":
			
			System.out.println("Carsamba, Cuma veya Cumartesi ");
			break;
			
			default:
				System.out.println("gecersiz harf girdiniz");
		}
		
	}

}
