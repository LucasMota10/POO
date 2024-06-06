package Aparelhos;

public class Caixa_de_Som implements ControleUniversal{
	
private int volume;
	
	public void Caixa_de_Som() {
		this.volume = 0;
	}
	public void ligar() {
		System.out.println("Caixa de Som ligada com Volume: " + this.volume);
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
		System.out.println("Volume da Caixa = " + this.volume);
	}
}
