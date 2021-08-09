package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	public boolean debitar(float valor){
		if (this.saldo < valor) {
			System.out.println("\nSaldo Insuficiente");
		}else this.saldo=this.saldo - valor;	
		return true;
	}
	
	public void creditar(float valor){
		this.saldo = this.saldo + valor;
	}
	
	public String exibir() {
		return ("\nNOME: "+nomeTitular+"\nCPF: "+cpf+"\nCONTA: "+numeroConta+"\nSALDO: "+saldo);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
}
	