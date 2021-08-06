public class InternetBanking {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		
		c1.nomeTitular="Michel Naressi";
		c1.cpfTitular="227.762.898-04";
		c1.numConta=12345;
		c1.digConta=6;
		c1.saldo=1000;
		
		c1.exibirInfo();
		
		c1.depositar(500);
		
		c1.exibirInfo();
		
		c1.sacar(50);
		
		c1.exibirInfo();
		
		}

}
