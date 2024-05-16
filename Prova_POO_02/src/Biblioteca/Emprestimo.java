package Biblioteca;

import java.util.ArrayList;

public class Emprestimo {
	
	private int numero;
	private int Dia_do_Emprestimo;
	private int Dia_da_Devolucao = -1;
	private ArrayList<Material> materiais;
	private float multa = 0;
	private static int quantidade_de_emprestimos = 0;
	
	public Emprestimo(int numero, int Dia_do_Emprestimo, ArrayList<Material> materiais){ // Fazer Emprestimo 
		this.numero = numero;
		this.Dia_do_Emprestimo = Dia_do_Emprestimo;
		this.materiais = materiais;
		quantidade_de_emprestimos++;
	}
	
	public Emprestimo() {
		quantidade_de_emprestimos++;
	}
	
	public void FazerEmprestimo(int numero, int Dia_do_Emprestimo, ArrayList<Material> materiais){ // Fazer Emprestimo 
		this.numero = numero;
		this.Dia_do_Emprestimo = Dia_do_Emprestimo;
		this.materiais = materiais;
		quantidade_de_emprestimos++;

	}
	
	public void FazerDevolucao(int Dia_da_Devolucao){
		this.Dia_da_Devolucao = Dia_da_Devolucao;
		int periodo = Dia_da_Devolucao - Dia_do_Emprestimo;
		
		for (Material material : materiais) {
			if(material.getTipo() == "Livro") {
				if(VerificaMulta(material,periodo)) {
					CalculaMulta(material,periodo);
				}else {
				}
				
			}else {
				if(material.getTipo() == "Tese") {
					if(VerificaMulta(material,periodo)) {
						CalculaMulta(material,periodo);
					}else {
					}
				}
			}
		}
	}
	
	private boolean VerificaMulta(Material material, int periodo){
		
		if(material.getTipo() == "Livro") {
			if(periodo > 5) {
				return true;	
			}else {
				return false;
			}
		}
		if(material.getTipo() == "Tese") {
			if(periodo > 10) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}
	
	private void CalculaMulta(Material material, int periodo){
		
		if(material.getTipo() == "Livro") {
			if(periodo <= 8) {
				this.multa = periodo*5;
			}else {
				this.multa = periodo*7;
			}
		}
		if(material.getTipo() == "Tese") {
			if(periodo <= 15) {
				this.multa = periodo*10;
			}else {
				this.multa = 100;
			}
		}
	}
	
	public void ImprimeEmprestimo() {
		System.out.println("Numero do emprestimo: " + this.numero);
		System.out.println("Data do Emprestimo: " + this.Dia_do_Emprestimo);
		if(this.Dia_da_Devolucao > 0) {
			System.out.println("Dia da Devolução: " + this.Dia_da_Devolucao);
		}else {
			System.out.println("Material não devolvido!");
		}
		System.out.println("Valor da Multa: " + this.multa);
		
		for(Material material : materiais) {
			if(material.getTipo() == "Livro") {
				System.out.println("É um Livro");
				System.out.println("Descrição: " + material.getDescricao());
				System.out.println("Ano de Lançamento: " +((Livro) material).getAnodeLancamento());
			}
			if(material.getTipo() == "Tese") {
				System.out.println("É uma Tese");
				System.out.println("Descrição: " + material.getDescricao());
				System.out.println("Data de Aprovação: " + ((Tese_de_Doutorado) material).getDatadeAprovacao());
			}
		}
		System.out.println("Número de Emprestimos: " + this.quantidade_de_emprestimos);
	}
	
	
}
