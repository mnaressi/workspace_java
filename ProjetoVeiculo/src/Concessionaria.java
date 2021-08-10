
public class Concessionaria {
	public static void main(String[] args) {
		
		Veiculo v1, v2;
		
		v1 = new Carro();
		v2 = new Moto();
		
		v1.marca  = "KIA";
		v1.modelo = "Cerato";
		//v1.ano = 2018;
		v1.acelerar();
		v1.frear();
		
		
		v2.marca = "Harley Davidson";
		v2.modelo = "Fat boy";
		//v2.tipo = "Cruiser";
		v2.acelerar();
		v2.frear();	
			
	
	}

}
