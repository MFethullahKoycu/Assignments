package assignment3;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("bir gun adi bahseder misiniz?");
		
		String input1 = scan.nextLine();
		
		
		switch (input1) {
		
			case "cuma":
			
			System.out.println("Muslumanlar icin kutsal gun ");
			
				break;
			
			case "cumartesi":
				
				System.out.println("Yahudiler icin kutsal gun ");
				
				break;
				
			case "Pazar":
				
				System.out.println("Hristiyanlar icin kutsal gun ");
				
				break;
				
				default:
					System.out.println("girilen gun semavi dinler tarafindan kutsal kabul edilmiyor");
					
				
		
		}
		
	}

}
