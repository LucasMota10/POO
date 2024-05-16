package Biblioteca;

public class Livro extends Material{
	
	private int AnodeLancamento;

	public int getAnodeLancamento() {
		return AnodeLancamento;
	}

	public void setAnodeLancamento(int anodeLancamento) {
		AnodeLancamento = anodeLancamento;
	}

	public Livro(int codigo, String descricao, int anodeLancamento) {
		super(codigo, descricao);
		AnodeLancamento = anodeLancamento;
		this.setTipo("Livro");
	}

	
	
}
