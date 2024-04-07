package App;
import Corretagem.*;

public class Main {

	public static void main(String[] args) {
		
		Proprietarios[] props = new Proprietarios[2];
		props[0] = new Proprietarios("Lucas", 18); // Nome e idade proprietario
		props[1] = new Proprietarios("Soussa", 25);	// Nome e idade proprietario
		
		Imovel tamoio = new Imovel(40040010, 350000, props); // Numero, preço, proprietarios
		Contrato cont1 = new Contrato(2345, 2010, tamoio); // Numero e Imovel ou Numero, Ano e Imovel, Ano default = 2024
		
		cont1.imprime_contrato();
		
		
		

	}

}
