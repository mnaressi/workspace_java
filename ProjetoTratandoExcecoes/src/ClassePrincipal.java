import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a, b, r;
		
		try {
		System.out.println("Digite um valor: ");
		a = teclado.nextInt();
		System.out.println("Digite outro valor: ");
		b = teclado.nextInt();
		r=a/b;
		System.out.println("O resultado da divisao e: "+r);

		teclado.close();
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("\n Nenhum número é divisível por zero");
		}
		catch (InputMismatchException e) {
			System.out.println("\n Por favor digite um numero inteiro");
		}catch (Exception e) {
			System.out.println("\nOps deu ruim");
			System.out.println("\nTipo de erro = "+e.getClass().getName());
		}
	}
}

