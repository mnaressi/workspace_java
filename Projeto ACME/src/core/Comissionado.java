package core;

public class Comissionado extends Funcionario{
	private double salarioBase;
	private double comissao;
		
	public Comissionado(int numRegistro, String nome, double salarioBase, double comissao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		double Salario = this.salarioBase + this.salarioBase * this.comissao / 100;
		return Salario;
		}
	
	
 	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	

}
