package app;
import java.util.ArrayList;
import Veve.*;

public class main {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("Kwid");
		carros.add("Onix");
		carros.add("Celta");
		carros.add(2,"Polo");
		
		System.out.println(carros);
		
		System.out.println("Tamanho do ArrayList: " + carros.size());
		
		carros.remove("Polo"); // ou carros.remove(2);
		
		
		 System.out.println(carros);
		
		 
		 System.out.println(" ");
		 
		String aux = carros.get(2);
		
		System.out.println(aux);
		
		
		System.out.println(" ");
		
		for(String car: carros) {
			System.out.println(car);
		}
		
		System.out.println(" ");
		carros.forEach(car -> { 
			System.out.println(car);
		});
		
		System.out.println(" ");
		System.out.println("Index de Kwid: " + carros.indexOf("Kwid"));
		System.out.println(" ");
		carros.clear();
		System.out.println(carros);
}
}