package relembrandoJava;

import java.util.Scanner;

public class MenorPosicao {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double v[];
		double menor;
		int n;
		int i , posM;
		System.out.println("Digite o numero do vetor: ");
		n = tec.nextInt();
		 v = new double[n];
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = tec.nextInt();
		}
		 menor = v[0];
		for (i = 0; i < n; i++) {
			if (v[i] < menor)
				menor = v[i];
			    posM = i;
		}
		System.out.printf("\n");
		for (i = 0; i < n; i++) {
			if (v[i] == menor)
				System.out.printf("Menor valor: %.0f%nPosicao: %d%n", v[i] , i+1);
		}

	}

}
