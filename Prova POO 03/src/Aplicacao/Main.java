package Aplicacao;
import Entidades.*;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		LocalDate atual = LocalDate.now();
		LocalDate ligacao = LocalDate.of(2024, 1, 20);
		
		Telemarketing_Ativo atv = new Telemarketing_Ativo(10, ligacao, "Lucas", "12345", "Soussa", false);
		
		atv.setNome_do_Arquivo("teste");
		atv.GravaNomeID();
		atv.LerNomeID();
		
		Telemarketing_Passivo pas = new Telemarketing_Passivo(12, ligacao, "José", "9999", "Paula", Tipo_da_Ligacao.ELOGIO, "Parabens");
		
		pas.setNome_do_Arquivo("Teste2");
		pas.GravaNomeID();
		pas.LerNomeID();
		
	}

}
