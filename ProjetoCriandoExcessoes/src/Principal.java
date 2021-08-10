import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	try {
	Produto p = new Produto ();
	int _id;
	String _nome, _strID, _strPreco;
	double _preco;
	
	System.out.println("Digite o Id: ");
	_strID = teclado.nextLine();
	_id = Integer.parseInt(_strID);
	p.setId(_id);
	
	System.out.println("Digite o Nome: ");
	_nome = teclado.nextLine();
	p.setNome(_nome);
	
	System.out.println("Digite o Preco: ");
	_strPreco = teclado.nextLine();
	_preco = Integer.parseInt(_strPreco);
	p.setPreco(_preco);
	
	System.out.println("Produto Cadastrado!");
	} catch (Exception ex) {
		System.out.println("Erro no Cadastro");
		System.out.println("Mensagem de erro "+ex.getMessage());
	}
}
}
