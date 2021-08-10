package userinterface;

import core.Chefe;
import core.Funcionario;
import core.Comissionado;
import core.Horista;
import core.Empreiteiro;

public class FolhaPgto {
	public static void main(String[] args) {
		
	Funcionario f1, f2, f3, f4;
	
	f1 = new Chefe(123, "Joao", 6000, 30, 250); 
	f2 = new Comissionado (456, "Jose", 4000, 20);
	f3 = new Horista (789, "Pedro", 20, 160);
	f4 = new Empreiteiro (1011, "Manoel", 10000);
		
	System.out.println("O sal�rio do "+f1.getNome()+" �: R$"+f1.calcularSalario());
	System.out.println("O sal�rio do "+f2.getNome()+" �: R$"+f2.calcularSalario());
	System.out.println("O sal�rio do "+f3.getNome()+" �: R$"+f3.calcularSalario());
	System.out.println("O sal�rio do "+f4.getNome()+" �: R$"+f4.calcularSalario());
	}

}
