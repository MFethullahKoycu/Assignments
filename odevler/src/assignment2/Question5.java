package assignment2;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir kenar uzunlugu giriniz");
		
		double kenarUzunlugu = scan.nextDouble();
		
		double cevreUzunlugu = kenarUzunlugu*4;
		
		System.out.println("Kenaruzunlugu " + kenarUzunlugu + " metre ise cevreuzunlugu " + cevreUzunlugu + " metredir ");
	
	
		double alanDegeri = kenarUzunlugu * kenarUzunlugu;
		
		System.out.println("Kenaruzunlugu " + kenarUzunlugu + " metre ise alani " + alanDegeri + " dir");
		
		scan.close();

	
	}
}
