package core;

public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;
	
	public void exibir (){
		System.out.println("Estudante: "+nome+"/"+email+"/"+numeroMatricula+"/"+curso);
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
