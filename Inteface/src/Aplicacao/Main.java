package Aplicacao;
import Aparelhos.*;


public class Main {

	public static void main(String[] args) {
		
		TV tv = new TV();
		
		tv.ligar();
		tv.aumenta(10);
		tv.getVolume();
		
		Caixa_de_Som caixa = new Caixa_de_Som();
		
		caixa.ligar();
		caixa.aumenta(30);
		caixa.getVolume();
		
		Ar_Condicionado ar = new Ar_Condicionado();
		
		ar.ligar();
		ar.aumenta(20);
		ar.gettemp();
	}

}
