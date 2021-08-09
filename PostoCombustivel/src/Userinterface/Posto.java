package Userinterface;
import java.util.Scanner;

import Core.Bomba;

public class Posto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao;
		int abastecer;
		//Utilizando o metodo construtor
		
		Bomba b1, b2;
		b1=new Bomba("Gasolina", 5);
		b2=new Bomba("Alcool", 4);
			
		do{
			System.out.println("\nBEM VINDO AO POSTO\nVALOR DO LITRO DA GASOLINA: "+b1.getPrecoLitro()+"\nVALOR DO LITRO DO ALCOOL: "+b2.getPrecoLitro());
			System.out.println("\nDigite a Opcao Desejada:\n1 - Abastecer Gasolina\n2 - Abastecer Alcool\n3 - Sair");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1:
				System.out.println("\nO sr Quer abastecer por litro(1) ou valor(2)?");
				abastecer=teclado.nextInt();
				if	(abastecer == 1) {
					System.out.println("\nQuantos Litros?");
					b1.abastecerPorLitros(teclado.nextDouble());
					System.out.println("\nAbastecimento Completado\n");
					System.out.println(b1.recibo());
				} else {
				System.out.println("\nQual valor?");
					b1.abastecerPorValor(teclado.nextDouble());	
					System.out.println("\nAbastecimento Completado");
					System.out.println(b1.recibo());
				}
				break;
			case 2:
				System.out.println("\nO sr Quer abastecer por litro(1) ou valor(2)?");
				abastecer=teclado.nextInt();
				if	(abastecer == 1) {
					System.out.println("\nQuantos Litros?");
					b2.abastecerPorLitros(teclado.nextDouble());
					System.out.println(b2.recibo());
				} else {
				System.out.println("\nQual valor?");
					b2.abastecerPorValor(teclado.nextDouble());	
					System.out.println(b2.recibo());
				}
				break;
			case 3:
				System.out.println("\nAGRADECEMOS A PREFERENCIA");
				break;
			default:
				System.out.println("\nOpcao invalida");
			}
		} while(opcao!=3);
		
		
	teclado.close();	
		
		
		
		
	}
}
