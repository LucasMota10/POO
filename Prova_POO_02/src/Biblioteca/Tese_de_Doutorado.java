package Biblioteca;

public class Tese_de_Doutorado extends Material{
	
	private String DatadeAprovacao;

	public String getDatadeAprovacao() {
		return DatadeAprovacao;
	}

	public void setDatadeAprovacao(String datadeAprovacao) {
		DatadeAprovacao = datadeAprovacao;
	}

	public Tese_de_Doutorado(int codigo, String descricao, String datadeAprovacao) {
		super(codigo, descricao);
		DatadeAprovacao = datadeAprovacao;
		this.setTipo("Tese");
	}
	
	
}
