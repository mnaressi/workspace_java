public class ContaCorrente {
	String nomeTitular;
	String cpfTitular;
	int numConta;
	int digConta;
	double saldo;
		
	void exibirInfo() {
		System.out.println("\nNome do titular: "+nomeTitular);
		System.out.println("CPF: "+cpfTitular);
		System.out.println("Conta e dígito: "+numConta+"-"+digConta);		
		System.out.println("Saldo: "+saldo+"\n");		
	}
	
	void depositar(double valor) {
		saldo=saldo+valor;		
		System.out.println("\nEfetuado Deposito de "+valor+" reais\n");
	}
	
	void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("\nSaldo insuficiente\n");
		}
		else {
			saldo=saldo-valor;
			System.out.println("\nEfetuado Saque de "+valor+" reais\n");
			}
		}
	}
