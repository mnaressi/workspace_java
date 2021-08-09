package core;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double limite) {
		super(nomeTitular,cpf,numeroConta);
		this.limite = limite;
		
		
	}
}
 