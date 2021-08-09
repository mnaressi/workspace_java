package Core;
public class Bomba {
	
	private String nome;
	private double precoLitro;
	private double qtdLitros;
	private double totalPagar;
	
	//metodo contrutor
	
	public Bomba (String nome,  double precoLitro) {
		this.nome = nome;
		this.precoLitro = precoLitro;		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdLitros() {
		return qtdLitros;
	}
	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}

	public void  abastecerPorLitros(double totalLitros) {
		this.qtdLitros = totalLitros;
		this.totalPagar = totalLitros*this.precoLitro;
		}
	
	public void  abastecerPorValor(double total) {
		this.totalPagar = total;
		this.qtdLitros = this.totalPagar/this.precoLitro;
		
	}
	
	public String recibo () {
		return ("RECIBO: \nCOMBUSTIVEL: "+this.nome+"\nQTD LITROS: "+this.qtdLitros+"\nTOTAL PAGAR: "+this.totalPagar);	
	}
	
}