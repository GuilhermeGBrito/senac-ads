package Aulas;

import javax.swing.JOptionPane;

public class OrdenacaoSepararParImpar {
	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int vetor[] = new int[qtd];

		preencherVetor(vetor);
		System.out.println("Antes da Ordenação");
		imprimirVetor(vetor);

		insertionSort(vetor);
		System.out.println("\n\nDepois da Ordenação");
		imprimirVetor(vetor);

		separarParImpar(vetor);
		System.out.println("\n\nDepois de separa impar e par");
		imprimirVetor(vetor);

		System.out.println("\n\nEncontrar Repetidos");
		encontrarRepetidos(vetor);

	}

	private static void encontrarRepetidos(int[] vetor) {
		int num = 0;
		for (int i = 0; i < vetor.length; i++) {
			num = vetor[i];
			for (int j = i + 1; j < vetor.length; j++) {
				if (num == vetor[j]) {
					System.out.println(vetor[i] + " " + i);
					break;
				}

			}
		}
	}

	private static void separarParImpar(int[] vetor) {
		for (int i = 1; i < vetor.length; i++) {
			int j = i;
			int x = vetor[j];
			while (j > 0 && vetor[j - 1] % 2 == 1) {
				vetor[j] = vetor[j - 1];
				j--;
			}
			vetor[j] = x;
		}

	}

	public static void insertionSort(int[] v) {
		for (int i = 1; i < v.length; i++) {
			int j = i;
			int x = v[j];
			while (j > 0 && x < v[j - 1]) {
				v[j] = v[j - 1];
				j--;
			}
			v[j] = x;
		}
	}

	public static void preencherVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * (100 - 1) + 1);
		}
	}

	public static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + " ");
	}

	static double somar(double num1, double num2) {
		return num1 + num2;
	}
}
