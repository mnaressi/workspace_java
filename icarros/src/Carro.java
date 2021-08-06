public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	
	void exibirInfo (){
		System.out.println("Automovel: "+marca+" "+modelo);
		System.out.println("Ano: "+ano+" Cor: "+cor);
		System.out.println("Preco: "+preco);
	}
	
	void aplicarDescont ( double porcentagem) {
		preco = preco - preco* porcentagem/100;
	}
	
	double calcularIpva() {
		double ipva;
		if (ano < 2000) {
			ipva = 0.0;
		}
		else ipva = preco * 0.04;
		return ipva;
	}
}
	

