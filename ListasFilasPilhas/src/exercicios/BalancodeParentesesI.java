package exercicios;

import java.util.Scanner;

public class BalancodeParentesesI {

	public static void main(String[] args) {
		 Scanner tec = new Scanner(System.in);
	        
	        while (tec.hasNext()) {

		        String ex = tec.nextLine();
		        int a = 0;
		        boolean errado = false;
	            
		        for (int i = 0; i < ex.length(); i++) {
					char caracter = ex.charAt(i);
					if (caracter == ')') {
						if (a == 0) {
							errado = true;
							break;
						}
						a--;
					} else if (caracter == '(') {
						a++;
					}
				}
	        	if (errado || a > 0) {
		            System.out.println("incorrect");	
		        } else {
		            System.out.println("correct");
		        }
			}
	    	

	}

}
