package Objeto1;
import java.util.Scanner;
public class BancoTeste {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		Banco b1 = new Banco(1, "Gabriel", 10000, 5000);
		Banco b2 = new Banco(2, "Romulo", 20000, 3000);
		

		System.out.println(" Olá " + b1.nome + "\n Bem vindo " + "\n Numero da sua conta é " + b1.conta);


		int decisao = -1;
		while (decisao != 0) {
			decisao = b1.escolhaFuncao();
			switch (decisao) {
			case 0:
				break;
			case 1:
				System.out.println("Valor para sacar");
				int saque = leitor.nextInt();
				b1.Saque(saque);
				break;
			case 2:
				System.out.println("Valor a depositar");
				int deposito = leitor.nextInt();
				b1.Deposito(deposito);
				System.out.println("Deposito feito com sucesso! Saldo atual " + b1.saldo);
				break;
			case 3:
				System.out.println(b1.MostrarConta());
				break;
			case 4:
				System.out.println("Valor para transferir: ");
				b1.transferirSaldo(b2);
				System.out.println("Transferencia realizada com sucesso! \n" + "Saldo restante = " + b1.saldo);
				break;
			default:
				System.out.println("Não existe essa opção!!!");
				break;

			}
			System.out.println();
		}
		System.out.println("Conta Romulo: " + b2.MostrarConta());
	}
}


