
public class Moto extends Veiculo{

	String tipo;
	
	public void acelerar() {
		System.out.println("Moto "+marca+"/"+modelo+ "("+tipo+") acelera com a mão");
	}
	
	public void frear() {
		System.out.println("Moto "+marca+"/"+modelo+ "("+tipo+") freia com o pé");
	}

}

