package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta;
		
		System.out.println("Digite o numero da conta ");
		int numero = leia.nextInt();
		
		System.out.println("Coloque o Nome do Titular da Conta ");
		leia.nextLine();
		String titular = leia.nextLine();
		System.out.println("Voce irá colocar algum deposito inicial (s/n) ? ");
		char resp = leia.next().charAt(0);
		
		if (resp == 's') {
			
			System.out.println("Digite o valor inical do deposito ");
			double depositoInicial = leia.nextDouble();
			
			conta = new Conta(numero, titular, depositoInicial);
		}
		
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: " );
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor que será depositado ");
		double valorDeposito = leia.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor do saque ");
		double valorSaque = leia.nextDouble();
		conta.deposito(valorSaque);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		

			leia.close();
			
	}

}
