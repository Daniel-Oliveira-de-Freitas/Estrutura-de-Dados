package exercicios;



import java.util.Scanner;

public class Sequencial {

	public static void main(String[] args) {
		int[] a = {2,6,9,3,7,10,5,8,4,1}; 
		int b,chave;
		
		Scanner tec = new Scanner(System.in);
	   int i;
	  
		for(i=0;i<10;i++) {
		 System.out.print(a[i]+",");	
		}
		System.out.print("\n");
		System.out.println("Qual o numero acima vc escolhe");
	   b = tec.nextInt();
	   chave = b;
	 
	  
	   for(i=0;i<10;i++) {
		   if(b ==a[i])
			 System.out.println("N["+ i +"] = " +a[i]);	
			}
	
	}
}	

	