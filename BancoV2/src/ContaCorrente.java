public class ContaCorrente {
	
		private String nomeTitular;
		private String cpfTitular;
		private int numConta;
		private int digConta;
		private double saldo;

		public String getNomeTitular() {
			return nomeTitular;
		}

		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}

		public String getCpfTitular() {
			return cpfTitular;
		}

		public void setCpfTitular(String cpfTitular) {
			this.cpfTitular = cpfTitular;
		}

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public int getDigConta() {
			return digConta;
		}

		public void setDigConta(int digConta) {
			this.digConta = digConta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public String exibir() {
			return "Conta: "+numConta+"/"+digConta+"\n"+"Titular: "+nomeTitular+" ("+cpfTitular+")"+"\n"+"Saldo: R$"+saldo;
		}
		
		public void depositar(double valor) {
			saldo=saldo+valor;			
		}
		
		public boolean sacar(double valor) {
			if (saldo >= valor) {
				saldo = saldo - valor;
				return true;
			} return false;
		}
}
