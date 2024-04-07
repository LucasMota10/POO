package Corretagem;
import Corretagem.*;

public class Imovel {
	private int numero;
	private double preco;
	private Proprietarios[] proprietarios = new Proprietarios[2];
	
	public Imovel(int numero, double preco, Proprietarios[] proprietarios) {
		this.numero = numero;
		this.preco = preco;
		this.proprietarios = proprietarios;
	}
	
	public double GetPreco() {
		return preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getnome1Proprietarios() {
		return proprietarios[0].getNome();
	}
	
	public String getnome2Proprietarios() {
		return proprietarios[1].getNome();
	}
	
	
	
}
