package userinterface;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class FolhaPgto {
	public static void main(String[] args) {
		
		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe(123, "Joao", 6000, 30, 250)); 
		lista.add(new Horista (789, "Pedro", 20, 160));
		lista.add(new Comissionado (456, "Jose", 4000, 20));
		lista.add(new Horista (789, "Joaquim", 30, 170));
		lista.add(new Empreiteiro (1011, "Isidro", 10000));
		lista.add(new Empreiteiro (1011, "Michel", 12000));
		
		for (Funcionario f : lista) {
			System.out.println("O salário do "+f.getNome()+" é: R$"+f.calcularSalario());
		}
		
		System.out.println("=========================================");
		
		for (int pos=0; pos < lista.size(); pos++) {
			System.out.println("O salário do "+lista.get(pos).getNome()+" é: R$"+lista.get(pos).calcularSalario());
			
		}
		
		/*lista = new Funcionario[6];
		
		
		lista[0] = new Chefe(123, "Joao", 6000, 30, 250); 
		lista[1] = new Horista (789, "Pedro", 20, 160);
		lista[2] = new Comissionado (456, "Jose", 4000, 20);
		lista[3] = new Horista (789, "Joaquim", 30, 170);
		lista[4] = new Empreiteiro (1011, "Isidro", 10000);
		lista[5] = new Empreiteiro (1011, "Michel", 12000);
			
		System.out.println("O salário do "+lista[0].getNome()+" é: R$"+lista[0].calcularSalario());
		System.out.println("O salário do "+lista[1].getNome()+" é: R$"+lista[1].calcularSalario());
		System.out.println("O salário do "+lista[2].getNome()+" é: R$"+lista[2].calcularSalario());
		System.out.println("O salário do "+lista[4].getNome()+" é: R$"+lista[3].calcularSalario());
		System.out.println("O salário do "+lista[5].getNome()+" é: R$"+lista[4].calcularSalario());
		System.out.println("O salário do "+lista[6].getNome()+" é: R$"+lista[5].calcularSalario());
		
		for (int pos=0; pos < lista.length; pos++) {
			System.out.println("O salário do "+lista[pos].getNome()+" é: R$"+lista[pos].calcularSalario());
		}
				
		
		
	
	Funcionario f1, f2, f3, f4;
	
	f1 = new Chefe(123, "Joao", 6000, 30, 250); 
	f2 = new Comissionado (456, "Jose", 4000, 20);
	f3 = new Horista (789, "Pedro", 20, 160);
	f4 = new Empreiteiro (1011, "Manoel", 10000);
		
	System.out.println("O salário do "+f1.getNome()+" é: R$"+f1.calcularSalario());
	System.out.println("O salário do "+f2.getNome()+" é: R$"+f2.calcularSalario());
	System.out.println("O salário do "+f3.getNome()+" é: R$"+f3.calcularSalario());
	System.out.println("O salário do "+f4.getNome()+" é: R$"+f4.calcularSalario());
	
	*/
	}

}
