package servicos;

import Entities.Ipod;

public class FuncoesIpod implements Ipod {

	@Override
	public void tocar() {
		System.out.println("Tocando Musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
		
	}

}
