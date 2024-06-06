package Aparelhos;

public class Ar_Condicionado implements ControleUniversal{
	
	private int temperatura;
	
	public void Ar_Condicionado(){
		this.temperatura = 24;
	}
	public void ligar() {
		System.out.println("Ar Ligado");
	}
	
	public void desligar() {
		System.out.println("Ar Desligado");
	}
	
	public void aumenta(int valor) {
		this.temperatura = this.temperatura + valor;
	}
	
	public void diminui(int valor) {
		this.temperatura = this.temperatura - valor;
		if(this.temperatura - valor < 0) {
			this.temperatura = 0;
		}
	}
	
	public void gettemp(){
		System.out.println("Temperatura do Ar = " + this.temperatura);
	}
}
