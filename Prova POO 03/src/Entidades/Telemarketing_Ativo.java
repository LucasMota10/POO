package Entidades;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Telemarketing_Ativo extends TeleMarketing{
	
	private boolean Oferta;
	
	public Telemarketing_Ativo(int ID, LocalDate Data, String Nome_Atendente, String CPF_Cliente, String Nome_Cliente,boolean Oferta) {
		super(ID,Data,Nome_Atendente,CPF_Cliente,Nome_Cliente);
		this.Oferta = Oferta;
	}

	public boolean getOferta() {
		return Oferta;
	}

	public void setOferta(boolean oferta) {
		Oferta = oferta;
	}

	public void GravaNomeID() {
		try {
			abreArquivo();
			BufferedWriter b = new BufferedWriter(new FileWriter(this.Nome_do_Arquivo, true));
			b.write("ID da Ligação: " + ID + "\n" + "Nome do Cliente: " + Nome_Cliente + "\n" + "O cliente Aceitou a Oferta? " + Oferta);
			
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
			b.close();
			
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
	
}
