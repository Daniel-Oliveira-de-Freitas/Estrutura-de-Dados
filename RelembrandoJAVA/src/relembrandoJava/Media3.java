package relembrandoJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
		double n1, n2, n3, n4, media, ex = 0;
        DecimalFormat df = new DecimalFormat("0.0");
		Scanner tec = new Scanner(System.in);
		n1 = tec.nextDouble();
		n2 = tec.nextDouble();
		n3 = tec.nextDouble();
		n4 = tec.nextDouble();
		media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;
	    System.out.println("Media: " + df.format(media));
		if (media >= 7) {
        	System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
        	System.out.println("Aluno em exame.");
            ex = tec.nextDouble();
			System.out.println("Nota do exame: " + df.format(ex));
        	media = (media + ex) / 2;
        	if (media >= 5) {
            	System.out.println("Aluno aprovado.");
        	} else {
            	System.out.println("Aluno reprovado.");
        	}
			System.out.println("Media final: " + df.format(media));
        } else {
        	System.out.println("Aluno reprovado.");
        }
	}
}
