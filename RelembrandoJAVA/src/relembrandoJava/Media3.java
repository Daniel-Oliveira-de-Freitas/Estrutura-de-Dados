package relembrandoJava;

import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
		double n1, n2, n3, n4, ex = 0, media, medF = 0;
		Scanner tec = new Scanner(System.in);
		System.out.println("n:");
		n1 = tec.nextDouble();
		n2 = tec.nextDouble();
		n3 = tec.nextDouble();
		n4 = tec.nextDouble();
		media = (n1 * 0.2 + n2 * 0.3 + n3 * 0.4 + n4 * 0.1);
		if (media >= 7) {
			System.out.printf("Media: %.1f %n ", media);
			System.out.println("Aluno Aprovado.");
		} else if (media < 4.9) {
			System.out.printf("Media: %.1f %n ", media);
			System.out.println("Aluno Reprovado.\n");
		} else if (media >= 5 && media <= 6.9) {
			System.out.printf("Media: %.1f %n ", media);
			System.out.println("Aluno em Exame.");
			System.out.println("n:");
			ex = tec.nextDouble();
			System.out.printf("Nota do Exame: %.1f %n ", ex);
			medF = (media + ex) / 2;
		}
		if (medF >= 5) {
			System.out.println("Aluno Aprovado.");
			System.out.printf("Media final: %.1f %n ", medF);

		} else if (medF<5) {			
			System.out.println("Aluno Reprovado.");
			System.out.printf("Media final: %.1f %n ", medF);
		}
		System.out.println("\n");

	}

}
