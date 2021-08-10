package core;

public class ContaEspecial extends Conta {
	private double limite, limiteUtil=0, limiteMax=0;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
		super(nomeTitular,cpf,numeroConta,saldo);
		this.limite = limite;
	}
		
	public boolean debitar(float valor){
		if (super.saldo > valor) 
			super.saldo = super.saldo - valor;
		else if (super.saldo + this.limite < valor) 
				System.out.println("\nSaldo Insuficiente");
		else {
			this.limiteMax = this.limite;
			this.limiteUtil = this.limite + (super.saldo - valor);
			this.limite = this.limiteUtil;
			super.saldo = 0;
		}
		return true;
	}
	
	public void creditar(float valor){
		if(limiteMax != 0){
			super.saldo=valor - (this.limiteMax - this.limiteUtil);
			this.limiteUtil = 0;
			this.limite = limiteMax;
			this.limiteMax = 0;
		}
	else super.saldo = super.saldo + valor;
	}
	
	public String exibir() {
		return "\nNOME: " + super.nomeTitular + "\nCPF: " + super.cpf + "\nCONTA: " + super.numeroConta + "\nSALDO: " + super.saldo + "\nLIMITE: " + this.limite;
	}
	
}

 