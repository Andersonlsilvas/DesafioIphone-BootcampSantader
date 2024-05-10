package servicos;

import Entities.Internet;

public class FuncoesInternet implements Internet{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

	@Override
	public void abrirNovaPagina() {
		System.out.println("Abrindo Nova Pagina");
		
	}

}