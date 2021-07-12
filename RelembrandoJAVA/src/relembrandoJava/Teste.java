package relembrandoJava;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

	int T, N, i, j;
	int fib[]=new int[61];
	fib[0] = 0;
	fib[1] = 1;
	
	Scanner input =new Scanner(System.in);
	 System.out.println("n");
	T =input.nextInt();
	for (j = 0; j < T; j++) {
		 System.out.println("n");
		N = input.nextInt();
		
		for ( i = 2; i < 61; i++) {
			fib[i] = fib[i - 1]+fib[i - 2];
			
					System.out.print("Fib("+i+") = "+fib[i]+"\n");
				}
}
}
}
