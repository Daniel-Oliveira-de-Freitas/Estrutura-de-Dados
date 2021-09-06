package exerciciosuri3;

import java.util.Scanner;

public class FilaRecreio {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
	
		int casos;
		int alunos[];
		int nota[];
		casos = tec.nextInt();
		for(int i =0;i<casos;i++) {
			int num = tec.nextInt();
			alunos = new int[num];
			nota = new int[num];
			for(int j=0;j<num;j++) {
				int entrada = tec.nextInt();
				alunos[j]=entrada;
				nota[j]=entrada;
			}
			bubbleSort(alunos);
			System.out.println(trocaAlunos(alunos,nota));
		}
		

	}
			
	public static void bubbleSort(int[] alunos) {
		for (int i = 1; i < alunos.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (alunos[i] > alunos[j]) {
		            int temp = alunos[i];
		            alunos[i] = alunos[j];
		            alunos[j] = temp;
		        }
		    }
		}
	}
	
	public static int trocaAlunos(int[] alunos, int[] nota) {
		int count =0;
		for (int i =0;i<alunos.length;i++) {
			if(alunos[i]==nota[i]) {
				count++;
			}
		}
		return count;
	}

}