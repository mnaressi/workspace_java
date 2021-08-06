
public class Loja {
	public static void main(String[] args) {
		Carro c1 = new Carro(), c2 = new Carro();
		
		c1.marca	= "Porsche";
		c1.modelo	= "Cayenne";
		c1.ano		= 2021;
		c1.cor		= "Preto";
		c1.preco	= 780000;
		
		c2.marca 	= "Chevrolet";
		c2.modelo	= "Corsa";
		c2.ano		= 1997;
		c2.cor		= "Prata";
		c2.preco	= 7500;
		
	//	double ipvac1 = c1.calcularIpava();
	//	double ipvac2 = c2.calcularIpava();
		
		c1.exibirInfo();
		System.out.println("Valor IPVA:"+c1.calcularIpva());
		System.out.println("===============================");
		c2.exibirInfo();
		System.out.println("Valor IPVA:"+c2.calcularIpva());
		
		c1.aplicarDescont(10.0);
		c2.aplicarDescont(5.0);	
		
		System.out.println("===============================");
		System.out.println("COM DESCONTO");
		System.out.println("===============================");
		
		c1.exibirInfo();
		System.out.println("Valor IPVA:"+c1.calcularIpva());
		System.out.println("===============================");
		c2.exibirInfo();
		System.out.println("Valor IPVA:"+c2.calcularIpva());
}
}
