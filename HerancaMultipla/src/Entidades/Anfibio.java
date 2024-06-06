
package Entidades;

public class Anfibio implements Barco, Carro{
	
	public void navegar() {
		System.out.println("Navegando");
	}
	
	public void girar() {
		System.out.println("Girando");
	}
	public void andar() {
		System.out.println("Andando");
	}
}
