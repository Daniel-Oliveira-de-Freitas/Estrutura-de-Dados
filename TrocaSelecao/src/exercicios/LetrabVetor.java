package exercicios;

import java.util.Random;

public class LetrabVetor {

	public static void main(String[] args) {
		int n = 1000;
		Random gerador = new Random();
		int vet[] = new int[n];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(vet.length);

		}

		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(vet.length);
			bubbleSort(vet);
			System.out.println(vet[i]);
		}
	}

	private static void bubbleSort(int vetor[]) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
	}

}
