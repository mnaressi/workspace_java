
public class Carro extends Veiculo {
	
	int ano;
	
	public void acelerar() {
		System.out.println("Carro "+marca+"/"+modelo+ "("+ano+") acelera com o pé");
	}
	
	public void frear() {
		System.out.println("Carro "+marca+"/"+modelo+ "("+ano+") freia com a mão");
	}

}
