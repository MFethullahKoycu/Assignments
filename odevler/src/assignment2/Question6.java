package assignment2;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dikdortgenler prizmasinin \n uzun kenar degerini \n kisa kenar degerini \n yuksekligini giriniz");
		
		double uzunKenarDegeri = scan.nextDouble();
		double kisaKenarDegeri = scan.nextDouble();
		double yukseklikDegeri = scan.nextDouble();
		
		System.out.println(uzunKenarDegeri * kisaKenarDegeri * yukseklikDegeri + " = " + " hacim");
		
	}
}
