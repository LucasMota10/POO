package Classes;

public class Pessoa {
	private String nome;
	private int ano_de_nascimento;
	private int idade;
	private Veiculo veiculo;
	
	
	public Pessoa(String nome, int ano_de_nascimento, Veiculo veiculo) {
		this.nome = nome;
		this.ano_de_nascimento = ano_de_nascimento;
		this.veiculo = veiculo;
		Calc_idade(ano_de_nascimento);
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public String Get_nome() {
		return nome;
	}
	public int Get_ano(){
		return ano_de_nascimento;
	}
	public int Get_idade() {
		return idade;
	}
	
	public void Calc_idade(int ano_de_nascimento){
		this.idade = 2024 - ano_de_nascimento;
	}
	
	public void ligaVeiculo(Veiculo veiculo) {
		veiculo.ligaVeiculo();
	}
	public void DesligaVeiculo(Veiculo veiculo) {
		veiculo.DesligaVeiculo();
	}
	
	public void aceleraVeiculo(Veiculo veiculo, int val) {
		veiculo.Acelera(val);
	}
	
	public void desaceleraVeiculo(Veiculo veiculo, int val) {
		veiculo.Desacelera(val);
	}
}
