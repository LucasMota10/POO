package app;
import java.util.ArrayList;
import Veve.*;

public class main_veiculo {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> carros = new ArrayList<>();
		
		Veiculo V = new Veiculo("Kwid", 12000, 2024);
		
		carros.add(V);
		
		carros.add(new Veiculo("Onix", 23245, 2021));
		
		System.out.println(carros);
	}

}
