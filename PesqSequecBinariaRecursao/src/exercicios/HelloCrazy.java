package exercicios;

import java.util.Scanner;

public class HelloCrazy {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n,r;
		System.out.println("Digite um numero:");
		r= tec.nextInt();
		
		n= r^6;
		while(n>r) {
			System.out.println("Ola mundao ES kkkkkk!!!!");
		}


	}

}
