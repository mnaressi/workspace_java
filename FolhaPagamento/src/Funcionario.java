public class Funcionario {
	
	private String nome;
	private int numeroFuncional;
	private String email;
	private double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String exibirInfo() {
		return nome+"          |"+numeroFuncional+"  |"+email+"  |"+salario+"  |";
		
	}
	
	public boolean reajustarSalario(double percentual) {
		salario = salario + salario * percentual/100;
		return true;
	}
	
	public double calcularImposto() {
		double imposto=0;
			if (salario <= 2000) {
				imposto = 0;
			}
			else if (salario > 2000 && salario <=3000) {
				imposto = 0.15;
				}
			else if (salario > 2300 && salario <=4500) {
					imposto = 0.25;
					}
			else if (salario > 2300 && salario <=4500) {
					imposto = 2500;
					}
			return imposto;
	}
}


