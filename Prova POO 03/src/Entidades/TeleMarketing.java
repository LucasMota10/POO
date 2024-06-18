package Entidades;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public abstract class TeleMarketing implements Contrato{
	
	protected int ID;
	protected LocalDate Data;
	protected String Nome_Atendente;
	protected String CPF_Cliente;
	protected String Nome_Cliente;
	protected String Nome_do_Arquivo;
	protected File arq;
	public TeleMarketing(int iD, LocalDate data, String nome_Atendente, String cPF_Cliente, String nome_Cliente) {
		super();
		ID = iD;
		Data = data;
		Nome_Atendente = nome_Atendente;
		CPF_Cliente = cPF_Cliente;
		Nome_Cliente = nome_Cliente;
	}

	public String getNome_do_Arquivo() {
		return Nome_do_Arquivo;
	}

	public void setNome_do_Arquivo(String nome_do_Arquivo) {
		this.Nome_do_Arquivo = nome_do_Arquivo;
	}
	
	public void abreArquivo() throws IOException{
		
		arq = new File(this.Nome_do_Arquivo);
		
		if(arq.createNewFile()) {
			System.out.println("Arquivo criado: "+ arq.getName());
		} else {
			System.out.println("Arquivo já existe "+ arq.getAbsoluteFile());
		}
	}

	public abstract void GravaNomeID();
	public abstract void LerNomeID();
	
}
