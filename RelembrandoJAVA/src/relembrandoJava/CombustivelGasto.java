package relembrandoJava;

import java.io.IOException;
import java.util.Scanner;

public class CombustivelGasto {

	public static void main(String[] args)throws IOException {
		double l,h,v,d;
		Scanner tec = new Scanner(System.in);
		System.out.println("digite quantas horas dura a viagem:");
		h = tec.nextInt();
		System.out.println("digite a velocidade media:");
		v = tec.nextInt();
		d = v*h;
		l = d/12;
		System.out.printf("Quantidade de litros necessária: %.3f litros\n" , l );
		
	}

}
