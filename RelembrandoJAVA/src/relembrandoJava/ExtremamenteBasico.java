package relembrandoJava;
import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		int A, B, X, op;
		System.out.println("---------------------- Extremamente Basico ----------------------------");
		Scanner tec = new Scanner(System.in);
		
		try {
			do {
				System.out.println("---------------------------------------------------------------------");
				System.out.println(" Digite um numero:\n");
				A = tec.nextInt();
				System.out.println(" Digite outro numero:\n");
				B = tec.nextInt();
				X = A + B;
				System.out.println("X = " + X);
				System.out.println("---------------------------------------------------------------------");
				System.out.println(" Digite 1 para somar novamente ou 0 para sair");
				op = tec.nextInt();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("---------------------------  FIM ------------------------------------");
		}while(op!=0);
		} catch (Exception e) {
			System.out.println("Digite um numero valido");
	
		}
		
	}

}
