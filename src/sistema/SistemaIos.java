package sistema;

import Entities.Internet;
import Entities.Ipod;
import Entities.Telefone;

public class SistemaIos implements Internet, Ipod, Telefone{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina da Internet");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina da Internet");
		
	}

	@Override
	public void abrirNovaPagina() {
		System.out.println("Abrindo nova pagina da Internet");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Musica do Ipod");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica do Ipod");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica do Ipod");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando do Telefone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo do Telefone");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando Correio de Voz do Telefone");
		
	}

}
