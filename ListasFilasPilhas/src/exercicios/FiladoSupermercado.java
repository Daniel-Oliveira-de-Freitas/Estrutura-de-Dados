package exercicios;

import java.util.Scanner;





public class FiladoSupermercado {
	public static void main(String[] args)
	{
		Scanner tec=new Scanner (System.in);
		System.out.println("Digite n:");
		int n=tec.nextInt();
		System.out.println("Digite m:");
		int m=tec.nextInt();
		int[] a=new int[n]; 
		int[] b=new int[m]; 
		for(int i=0;i<n;i++)
		
			a[n]=tec.nextInt();	
		for(int i=0;i<m;i++)
			
			b[m]=tec.nextInt();
		
		int[] tmp=new int[n]; 
		int t=0;
		int time=0;
		while(t<m)  
		{
			if(t<n)
			{
				tmp[t]=b[t]*a[t];
				
				t++;
			}
			else
			{
				int ind=tmp[0];
				int z=0;
				for(int i=0;i<n;i++)
					if(ind>tmp[i])
					{
						ind=tmp[i];
						z=i;
					}
				tmp[z]+=b[t]*a[z];				
				z=0;
				t++;	
			}			
		}
		int ind=tmp[0];
		
		for(int i=0;i<n;i++)
			if(ind<tmp[i])
				ind=tmp[i];
		System.out.println(ind);			
	}
}
