package Veve;

public class Veiculo {
	private String Nome;
	private int kmrodados;
	private int ano;
	
	
	public Veiculo(String nome, int kmrodados, int ano) {
		super();
		Nome = nome;
		this.kmrodados = kmrodados;
		this.ano = ano;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getKmrodados() {
		return kmrodados;
	}
	public void setKmrodados(int kmrodados) {
		this.kmrodados = kmrodados;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return String.join(System.getProperty("line.separator"), this.Nome);
	}
}
