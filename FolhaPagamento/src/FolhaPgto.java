import java.util.Scanner;

public class FolhaPgto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao;
		double reajuste;
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Michel");
		f1.setNumeroFuncional(123);
		f1.setEmail("michel@java.com");
		f1.setSalario(3000);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Isidro");
		f2.setNumeroFuncional(456);
		f2.setEmail("isidro@java.com");
		f2.setSalario(2000);
		
		Funcionario f3 = new Funcionario();
		f3.setNome("Ze");
		f3.setNumeroFuncional(789);
		f3.setEmail("ze@java.com");
		f3.setSalario(1000);
		
		do{
			System.out.println("\nDigite a Opcao Desejada:\n1 - Exibir\n2 - Reajustar Salario\n3 - Sair");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1:
				System.out.println(f1.exibirInfo()+(f1.calcularImposto()*f1.getSalario()));
				System.out.println(f2.exibirInfo()+(f2.calcularImposto()*f2.getSalario()));
				System.out.println(f3.exibirInfo()+(f3.calcularImposto()*f3.getSalario()));
				break;
			case 2:
				System.out.println("\nDigite o valor do Reajuste: ");
				reajuste=teclado.nextDouble();
				f1.reajustarSalario(reajuste);
				f2.reajustarSalario(reajuste);
				f3.reajustarSalario(reajuste);
				break;
			case 3:
				System.out.println("\nSessão encerrada");
				break;
			default:
				System.out.println("\nOpcao invalida");
			}
		} while(opcao!=4);
		
		
	teclado.close();	
		
		
		
		
	}
}
	
