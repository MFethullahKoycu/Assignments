package assignment2;
import java.util.Scanner;

public class Question4 {

public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		  System.out.println("Lutfen bir \'Saat degeri\' degeri giriniz.");
	       
		  long saatDeger = scan.nextLong();
		  long saniyeDeger = saatDeger * 60 * 60;
		  
		  System.out.println(saatDeger+ "\tSaat\t" + saniyeDeger + "\tSaniyedir");

			scan.close();

}
	
}
