package relembrandoJava;

import java.util.Scanner;

public class oMaior {

	public static void main(String[] args) {
		int a,b,c ,MAB,MABC;
		Scanner tec = new Scanner(System.in);
		System.out.println("Digitte 3 valores:");
		a = tec.nextInt();
		b = tec.nextInt();
		c = tec.nextInt();
		MAB = (a+b+Math.abs(a-b))/2;
		MABC = (MAB + c + Math.abs(MAB-c))/2;
			System.out.println(MABC + " eh o maior");
			
	}
}
