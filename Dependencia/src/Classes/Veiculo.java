package Classes;

public class Veiculo {
	private String placa;
	private double preco;
	private int ano;
	private double velocidade;
	private String status;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Veiculo(String placa, double d, int ano, double e, String status){
		this.placa = placa;
		this.preco = d;
		this.ano = ano;
		this.velocidade = e;
		this.status = status;
	}
	
	public void Acelera(float val) {
		this.velocidade = velocidade + val;
	}
	
	public void Desacelera(float val) {
		if(this.velocidade - val <= 0) {
			this.velocidade = 0;
		}else {
			this.velocidade = velocidade - val;
		}
	}
	
	public void ligaVeiculo() {
		this.status = "Ligado"; 
	}
	
	public void DesligaVeiculo() {
		this.status = "Desligado"; 
	}
	
}
