package Aparelhos;

public interface ControleUniversal {
	
	public void ligar();
	public void desligar();
	public void aumenta(int valor);
	public void diminui(int valor);
	
	default void status() {
		System.out.println("Código na interface");
	}
}
