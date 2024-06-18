package Entidades;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Telemarketing_Passivo extends TeleMarketing{
	
	private Tipo_da_Ligacao tipo;
	private String demanda;
	
	public Telemarketing_Passivo(int ID, LocalDate Data, String Nome_Atendente, String CPF_Cliente, String Nome_Cliente, Tipo_da_Ligacao tipo, String demanda) {
		super(ID,Data,Nome_Atendente,CPF_Cliente,Nome_Cliente);
		this.tipo = tipo;
		this.demanda = demanda;
	}

	public Tipo_da_Ligacao getTipo() {
		return tipo;
	}

	public void setTipo(Tipo_da_Ligacao tipo) {
		this.tipo = tipo;
	}

	public String getDemanda() {
		return demanda;
	}

	public void setDemanda(String demanda) {
		this.demanda = demanda;
	}

	public void GravaNomeID() {
		try {
			abreArquivo();
			BufferedWriter b = new BufferedWriter(new FileWriter(this.Nome_do_Arquivo, true));
			b.write("ID da Ligação: " + ID + "\n" + "Nome do Cliente: " + Nome_Cliente + "\n" + "Tipo do Relacionamento: "+ tipo);
			
			b.close();
			
		} catch (IOException e) {
			e.getMessage();
		}
		
	}
	
	public void LerNomeID() {
		try {
			BufferedReader b = new BufferedReader(new FileReader(this.Nome_do_Arquivo));
			
			String linha = "--------\n";
			System.out.println(linha);
			
			while((linha=b.readLine())!= null) {
				System.out.println(linha);
			}
			
			System.out.println("Quantidade de Caracteres da Mensagem: " + arq.length());
			b.close();
			
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
}
