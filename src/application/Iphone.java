package application;

import entities.Internet;
import entities.Ipod;
import entities.Telefone;
import sistema.SistemaIos;

public class Iphone {

	public static void main(String[] args) {


		SistemaIos iphone = new SistemaIos();
		SistemaIos internet = new SistemaIos();
		SistemaIos telefone = new SistemaIos();
		
		Ipod tocar = iphone;
		Ipod pausar = iphone;
		Ipod selecionarMusica = iphone;
		
		System.out.println("Ipod: ");
		tocar.tocar();
		pausar.pausar();
		selecionarMusica.selecionarMusica();
		
		System.out.println();
		System.out.println("Internet: ");
		
		Internet navegar = internet;
		Internet atualiza = internet;
		Internet abrirNovaPagina = internet;
		
	
		navegar.exibirPagina();
		atualiza.atualizarPagina();
		abrirNovaPagina.abrirNovaPagina();
		
		System.out.println();
		System.out.println("Telefone: ");
		
		Telefone ligar = telefone;
		Telefone atender = telefone;
		Telefone correioDeVoz = telefone;
		
		ligar.ligar();
		atender.atender();
		correioDeVoz.iniciarCorreioDeVoz();
	}



}