import java.util.Scanner;

public class InternetBankingv2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ContaCorrente c1 = new ContaCorrente();
		
		int opcao;
		
		System.out.println("Digite as Informações da Conta: \n");
		
		System.out.println("Nome: ");
		c1.nomeTitular=teclado.next();
		System.out.println("Cpf: ");
		c1.cpfTitular=teclado.next();
		System.out.println("Conta: ");
		c1.numConta=teclado.nextInt();
		System.out.println("Digito: ");
		c1.digConta=teclado.nextInt();
		System.out.println("Saldo: ");
		c1.saldo=teclado.nextDouble();
				
		do{
			System.out.println("\nDigite a Opcao Desejada:\n1 - Exibir\n2 - Depositar\n3 - Sacar\n4 - Sair");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1:
				c1.exibirInfo();
				break;
			case 2:
				System.out.println("\nDigite o valor do depósito: ");
				c1.depositar(teclado.nextDouble());
				break;
			case 3:
				System.out.println("\nDigite o valor do saque: ");
				c1.sacar(teclado.nextDouble());
				break;	
			case 4:
				System.out.println("\nSessão encerrada");
				break;
			default:
				System.out.println("\nOpcao invalida");
			}
		} while(opcao!=4);
	}
}
