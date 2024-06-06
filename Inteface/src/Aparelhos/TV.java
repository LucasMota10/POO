package Aparelhos;

public class TV implements ControleUniversal {
	
	private int volume;
	
	public void TV() {
		this.volume = 0;
	}
	public void ligar() {
		System.out.println("TV ligada com Volume: " + this.volume);
	}
	
	public void desligar() {
		System.out.println("TV Desligada");
	}
	
	public void aumenta(int valor) {
		this.volume = this.volume + valor;
	}
	
	public void diminui(int valor) {
		this.volume = this.volume - valor;
		if(this.volume - valor < 0) {
			this.volume = 0;
		}
	}
	
	public void getVolume() {
		System.out.println("Volume da TV = " + this.volume);
	}
	
}
