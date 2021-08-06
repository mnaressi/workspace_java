public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Salario: "+salario);		
	}
	
	void aumentarSaralio (double aumento) {
		salario = salario + salario * aumento/100;
	}

}

