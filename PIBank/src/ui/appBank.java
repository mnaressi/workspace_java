package ui;

import core.Conta;

public class appBank {
	public static void main(String[] args) {
		
		Conta c = new Conta("Michel","123.456.789-10", 987654, 1000);
			
		System.out.println(c.exibir());
		
		c.debitar(2000);
		
		System.out.println(c.exibir());
		
		c.creditar(1000);
		
		System.out.println(c.exibir());

}
	
}