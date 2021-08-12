package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Binaria {

	public static int buscaBinaria(int[] a , int inicio,int fim, int chave) {
		int meio = (inicio + fim)/2;
		if (inicio>fim)
			return -1;
		else if (chave==a[meio])
			 return meio;
		else if(chave < a[meio])
			return buscaBinaria(a,inicio,meio -1,chave);
		else
		return buscaBinaria(a,meio +1,fim,chave);
	}
	
	
	
	
	public static void main(String[] args) {
		int[] a = {2,6,9,3,7,10,5,8,4,1};
		int	inicio = 0;
		int fim=10 ;
		int meio ,chave,i;
		Scanner tec = new Scanner(System.in);
		
		
		Arrays.sort(a);
		for(i=0;i<10;i++) {
			 System.out.print(a[i]+",");	
			}
		System.out.print("\n");
		System.out.println("Digite o ultimo numero do vetor: ");
		chave= tec.nextInt();
		
		System.out.println	("["+buscaBinaria(a, inicio, fim, chave)+"] = "+chave);
				
				 

			 }
			 
	}


