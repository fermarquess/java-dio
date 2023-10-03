package produto;

import funcionalidades.aparelhoTelefonico.Telefone;
import funcionalidades.navegadorNaInternet.Navegador;
import funcionalidades.reprodutorMusical.Player;

public class IPhone implements Telefone, Navegador, Player{
	
	public void ligar() {
		
		System.out.println("Discando");
		
	}

	public void atender() {
		System.out.println("Atendendo");
		
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
		
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo página");
		
	}

	
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	
	public void atualizarPagina() {
		System.out.println("Página atualizada");
		
	}
	
	public void tocar() {
		System.out.println("Música tocando");
		
	}


	public void pausar() {
		System.out.println("Musica pausada");
		
	}

	
	public void selecionarMusica() {
		System.out.println("Selecionando música");
		
	}
	
	
}