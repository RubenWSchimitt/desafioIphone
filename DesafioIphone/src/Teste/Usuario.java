package Teste;

import Desafio.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.exibirPagina("github.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		iphone.selecionarMusica("Rick Astley - Never Gonna Give You Up");
		iphone.tocar();
		iphone.pausar();
		
		iphone.ligar("98765-4321");
		iphone.atender();
		iphone.iniciarCorreioVoz();
	}
}
