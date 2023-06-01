package Aulas;

import javax.swing.JOptionPane;

public class BuscaLinear {
	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int vetor[] = new int[qtd];

		int maior = Integer.MIN_VALUE;
		preencherVetor(vetor, maior);
		imprimirVetor(vetor);
		int resp = 0;
		do {
			int localizado = -1;
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja pesquisar no vetor"));

			localizado = buscaLinear(vetor, num);

			if (localizado != -1)
				System.out.println("\n\nO número " + num + " está no índice: " + localizado);
			else
				System.out.println("\n\nO número não foi localizado no vetor.");
			resp = JOptionPane.showConfirmDialog(null, "Deseja pesquisar outro?");
		} while (resp == 0);
	}

	public static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + " ");
	}

	public static void preencherVetor(int[] vetor, int maior) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
			if (maior < vetor[i])
				maior = vetor[i];
		}
		System.out.println("\nO maior número do vetor é: " + maior);
	}

	public static int buscaLinear(int v[], int x) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x)
				return i;
		}
		return -1;
	}

}
