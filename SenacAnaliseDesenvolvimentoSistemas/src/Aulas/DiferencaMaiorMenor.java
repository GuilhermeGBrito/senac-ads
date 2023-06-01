package Aulas;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class DiferencaMaiorMenor {

	/*
	 * O traço de uma matriz é a soma dos elementos de sua diagonal principal.
	 * Implemente uma função que receba uma matriz quadrada (número de linhas =
	 * número de colunas) e devolva o seu traço.
	 */

	public class VetorDiferença {
		public static void main(String[] args) {
			int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
			int vetor[] = new int[qtd];
			preencherVetor(vetor);
			Arrays.sort(vetor);// ordena o vetor
			imprimirVetor(vetor);
			System.out.println("\nA maior diferença é: " + vetor[vetor.length - 1] + " - " + vetor[0] + " = "
					+ (vetor[vetor.length - 1] - vetor[0]));

		}

		public static void imprimirVetor(int[] vetor) {
			for (int i = 0; i < vetor.length; i++)
				System.out.print(vetor[i] + " ");
		}

		public static void preencherVetor(int[] vetor) {
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = (int) (Math.random() * (100 - 1) + 1);
			}
		}

		public static int buscaBinaria(int v[], int x) {
			int i, m, f;
			i = 0;
			f = v.length - 1;
			while (i <= f) {
				m = (i + f) / 2;
				if (v[m] == x)
					return m;
				if (x < v[m]) // esquerda
					f = m - 1;
				else // x > v[m] - direita
					i = m + 1;
			}
			return -1;
		}

	}

}
