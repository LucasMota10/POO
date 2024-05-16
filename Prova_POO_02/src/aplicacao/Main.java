package aplicacao;
import java.util.ArrayList;

import Biblioteca.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Material> Materiais_para_emprestimo = new ArrayList<Material>();
		
		Livro livro1 = new Livro(123,"Livro 1",2024);
		
		Materiais_para_emprestimo.add(livro1);
		Tese_de_Doutorado tese1 = new Tese_de_Doutorado(321, "Tese 1", "20/03/2022");
		Materiais_para_emprestimo.add(tese1);
		
		Emprestimo emprestimo1 = new Emprestimo(22002,2,Materiais_para_emprestimo);
		
		emprestimo1.FazerDevolucao(10);
		
		emprestimo1.ImprimeEmprestimo();
		
	}

}
