package assignment3;
import java.util.Scanner;

public class Question2 {

	public static void main (String [] args) {
	
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("bir gun bahseder misiniz acaba? ");
		
		
		String input1 = scan.nextLine();
		
		String sonuc = input1.equals ("cumartesi") ? "Bugun haftasonu ve cumartesi gunu" : input1.equals("pazar") ? "Bugun haftasonu ve pazar gunu" : "Bugun hafta ici";
		
		System.out.println(sonuc);
		
		

		
		
	}
	
}
