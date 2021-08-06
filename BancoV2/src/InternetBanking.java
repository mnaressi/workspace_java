import java.util.Scanner;

public class InternetBanking {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		double valor;
		
		ContaCorrente c1;
		c1 = new ContaCorrente();
		c1.setNumConta(12345);
		c1.setDigConta(6);
		c1.setNomeTitular("Michel");
		c1.setCpfTitular("123.456.789-10");
		c1.setSaldo(200.00);	
		
		do{
			System.out.println("\nDigite a Opcao Desejada:\n1 - Exibir\n2 - Depositar\n3 - Sacar\n4 - Sair");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1:
				System.out.println(c1.exibir());
				break;
			case 2:
				System.out.println("\nDigite o valor do depósito: ");
				c1.depositar(teclado.nextDouble());
				System.out.println("\nDeposito efetuado");
				break;
			case 3:
				System.out.println("\nDigite o valor do saque: ");
				if(c1.sacar(teclado.nextDouble())) {
					System.out.println("\nSaque autorizado");
				} else System.out.println("\nSaldo insuficiente");
				break;	
			case 4:
				System.out.println("\nSessão encerrada");
				break;
			default:
				System.out.println("\nOpcao invalida");
			}
		} while(opcao!=4);
		
		
	teclado.close();	
		
	}

}
