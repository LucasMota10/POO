package Corretagem;

public class Contrato {
	private int numero;
	private int ano;
	private double val_corretagem;
	private Imovel imovel;
	
	public Contrato(int numero, int ano, Imovel imovel) {
		this.numero = numero;
		this.ano = ano;
		this.imovel = imovel;
		calc_corretagem();
	}
	
	public Contrato(int numero, Imovel imovel) {
		this.numero = numero;
		this.ano = 2024;
		this.imovel = imovel;
		calc_corretagem();
	}
	
	public String GetPropnome() {
		return imovel.getnome1Proprietarios();
	}

	public int getNumero() {
		return numero;
	}

	public int getAno() {
		return ano;
	}

	public double getprecImovel() {
		return imovel.GetPreco();
	}

	public double getVal_corretagem() {
		return val_corretagem;
	}

	public void calc_corretagem(){
		
		if(ano >= 2020 || imovel.GetPreco() >= 1000000) {
			this.val_corretagem = (5*imovel.GetPreco())/100;
		}else {
			this.val_corretagem = (10*imovel.GetPreco())/100;
		}	
	}
	
	public String getprop1(){
		return imovel.getnome1Proprietarios();
	}
	
	public String getprop2(){
		return imovel.getnome2Proprietarios();
	}
	
	public void imprime_contrato() {
		System.out.println("Numero do Contrato: " + this.numero);
		System.out.println("Ano: " + this.ano);
		System.out.println("Preço do Imovel: " + getprecImovel());
		System.out.println("Valor da Corretagem: " + getVal_corretagem());
		System.out.println("Nome do Proprietario 1: " + getprop1());
		System.out.println("Nome do Proprietario 2: " + getprop2());
	}
}
