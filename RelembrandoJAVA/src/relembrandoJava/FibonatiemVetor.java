package relembrandoJava;

import java.util.Scanner;

public class FibonatiemVetor {

	public static void main(String[] args) {
		 Scanner tec = new Scanner(System.in);
	        int v[]= new int[60];;
	        int n;
	       v[0] = 0; 
	        v[1] = 1; 
	        
	        System.out.println("n");
	        n = tec.nextInt();	        
	        for (int i = 2; i < 60; i++) {
	             v[i] = v[i-2]+v[i-1];            
	        }	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("x");
	            int x = tec.nextInt();
	            System.out.println("Fib("+x+") = "+v[x]+"\n");
	        }
	}

}
