package relembrandoJava;

import java.util.Scanner;

public class PreencimentoVetor {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int v[] = new int[10];;
		int i ;
		System.out.println("Digite oprimeiro numero do vetor: ");
		v[0] = tec.nextInt();
		 
		for ( i=1; i <10; i++) {
            v[i] = v[i-1] * 2;
        }
        for ( i=0; i <10; i++) {
            System.out.println("N["+ i +"] = " + v[i]);
        }
}
}
