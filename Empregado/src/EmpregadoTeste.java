import java.util.Scanner;

public class EmpregadoTeste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Empregado e1 = new Empregado();
	
		System.out.println("Digite o Nome, Cargo e Salario: \n");
		e1.nome= teclado.next();
		e1.cargo= teclado.next();
		e1.salario= teclado.nextDouble();
		
		System.out.println("\nINFOS\n");
		e1.imprimir();
		
		System.out.println("\nDigite o percentual de aumento: ");
		e1.aumentarSaralio(teclado.nextDouble());
		
		System.out.println("\nINFOS COM AUMENTO\n");
		e1.imprimir();
		
		teclado.close();
	}
	
}
