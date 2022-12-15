package assignment3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("4 basamakli bir sayi alabilir miyim acaba ? ");
		
		int input1 = scan.nextInt();
		
		String sonuc = input1 %5 == 0 ? input1 %10 == 5 ?  "Girdiginiz sayi son rakami 5 olan bir tek sayidir": "Bu sayi 5\"e\" bolenebilen bir cift sayidir  " : "Girdiginiz sayi 5\"e\" bolenemeyen bir sayidir ";
		
		System.out.println(sonuc);
		
	}

}
