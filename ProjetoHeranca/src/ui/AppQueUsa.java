package ui;

import core.Estudante;
import core.Pessoa;

public class AppQueUsa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Michel");
		p.setEmail("michel@java.com");
		p.exibir();
		
		Estudante e = new Estudante ();
		e.setNumeroMatricula(1234);
		e.setCurso("Java");
		e.setNome("Ze");
		e.setEmail("ze@java.com");
	    e.exibir();

	}

}