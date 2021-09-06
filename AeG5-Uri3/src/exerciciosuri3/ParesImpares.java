package exerciciosuri3;

		import java.util.Scanner;
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.List;
		
public class ParesImpares {


			public static void main(String[] args) {
				Scanner tec = new Scanner(System.in);
				
				List<Integer> lista = new ArrayList<>();
				List<Integer> par 	= new ArrayList<>();
				List<Integer> impar = new ArrayList<>();
				
				int n = tec.nextInt();
				for (int i=0 ; i<n ; i++)
					lista.add(tec.nextInt());
						
				for (Integer x: lista){
					if (x%2==0)
						par.add(x);
					else
						impar.add(x);
				}
				
				Collections.sort(par);
				Collections.sort(impar);
				Collections.reverse(impar);
				
				for (Integer y: par)
					System.out.println(y);
				for (Integer z: impar)
					System.out.println(z);
				
				
			}
		}
	
