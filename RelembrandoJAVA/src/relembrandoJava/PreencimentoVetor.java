package relembrandoJava;

import java.util.Scanner;

public class PreencimentoVetor {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int v[];
		int n;
		int i ,j;
		System.out.println("Digite o numero do vetor: ");
		n = tec.nextInt();
		 v = new int[n];
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = tec.nextInt();				
			}
		for (j = 0; j < n; j++) {
				System.out.println("N["+j+"] = "+ v[j]);
		}
	}
}

