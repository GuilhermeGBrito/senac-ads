package Objeto1;
import java.util.Scanner;
public class Banco {
	

		int conta;
		String nome;
		double saldo;
		double limite;

		Scanner leitor = new Scanner(System.in);
		Banco() {

		}

		Banco(int conta, String nome, double saldo, double limite) {
			this.conta = conta;
			this.nome = nome;
			this.saldo = saldo;
			this.limite = limite;

		}

		String MostrarConta() {
			return String
					.format("Numero da conta: " + conta + "\nNome: " + nome + "\nSaldo: " + saldo + "\nLimite " + limite);
		}

		public void Saque(double valor) {
			if (valor > saldo) {
				System.out.println("POBRE");
			} else {
				saldo -= valor;
				System.out.println("Saque realizado Valor restante = " + saldo);
			}

		}

		public double Deposito(double valor) {
			double valorRestante = saldo += valor;
			return valorRestante;
		}

		public int escolhaFuncao() {
			System.out.println("[1] : Saque");
			System.out.println("[2] : Deposito");
			System.out.println("[3] : Mostrar conta");
			System.out.println("[4] : Pix");
			System.out.println("Digite a opção desejada ");
			int decisao = leitor.nextInt();

			return decisao;

		}

		public void transferirSaldo(Banco b2) {
			double transferencia = leitor.nextDouble();
			b2.saldo += transferencia;
			saldo -= transferencia;

		}

	}




