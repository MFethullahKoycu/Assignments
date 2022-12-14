package assignment2;
import java.util.Scanner;
public class Question3 {
	public static void main (String []args) {
	

	
			
			Scanner scan = new Scanner(System.in);

			
			System.out.println("Mil giriniz ");
			
			double milDeger = scan.nextDouble();
			
			double kmDeger = milDeger *1.6;
		
			System.out.println(milDeger + "mil\t" + "esittir\t" + kmDeger + "Kilometre");
			
			scan.close();

		}
}
