package app;
import Geometrica.*;

public class Main {

	public static void main(String[] args) {
		
		Figura f1 = new Figura(10,12,Geometrica.Tipo_Figura.TRIANGULO);
		Figura f2 = new Figura(5,2,Geometrica.Tipo_Figura.RETANGULO);
		Figura f3 = new Figura(7,1,Geometrica.Tipo_Figura.RETANGULO);
		
		System.out.println("Area 1: " + f1.getArea());
		System.out.println("Area 2: " + f2.getArea());
		System.out.println("Area 3: " + f3.getArea());

		System.out.println("Foram Criados " + Figura.getContador() + " Objetos");
		
	}

}
