package app;
import Classes.*;

public class maain {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("PVK-1234",200000.34, 2012, 82.49, "Ligado");
		Veiculo v2 = new Veiculo("ABC-0923",325000.78, 2018, 82.40, "Ligado");
		
		Pessoa p1 = new Pessoa("Joao", 2005, v1);
		Pessoa p2 = new Pessoa("Maria", 2007, v2);
		
		p1.getVeiculo().Desacelera(12);

		
	}

}
