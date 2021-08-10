package ui;

import core.Conta;
import core.ContaEspecial;

public class appBank {
	public static void main(String[] args) {
		
/*		Conta c = new Conta("Michel","123.456.789-10", 987654, 1000);
		System.out.println(c.exibir());
		c.debitar(2000);
		System.out.println(c.exibir());
		c.creditar(1000);
		System.out.println(c.exibir());*/
		
		Conta esp = new ContaEspecial("Ze","123.456.789-10", 121212, 100, 200);
		System.out.println(esp.exibir());
		esp.debitar(150);
		System.out.println(esp.exibir());
		esp.creditar(0);
		System.out.println(esp.exibir());

}
	
}