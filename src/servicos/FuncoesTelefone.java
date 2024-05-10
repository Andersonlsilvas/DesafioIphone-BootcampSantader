package servicos;

import entities.Telefone;

public class FuncoesTelefone implements Telefone {

	@Override
	public void ligar() {
		System.out.println("Lingando");
		
		
	}
	@Override
	public void atender() {
		System.out.println("Atendendo");
		
		
	}
	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de Voz");
		
	}

}