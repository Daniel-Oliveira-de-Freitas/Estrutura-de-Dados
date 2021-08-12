package exercicios;

import java.util.Scanner;

public class Recursao {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n;
		do {
		System.out.println("Digite um numero para ver o fatorial");
		n = tec.nextInt();
		System.out.println("Fatorial de: "+n + " = "+fatorial(n));
		}while(n !=0);
	}
	public static int fatorial(int f) {
		if(f==0)
			return 1;
		else
			return f* fatorial(f-1);
	}

}
