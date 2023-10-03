package loja;

import funcionalidades.aparelhoTelefonico.Telefone;
import funcionalidades.navegadorNaInternet.Navegador;
import funcionalidades.reprodutorMusical.Player;
import produto.IPhone;

public class Vendas {
	
	public static void main(String[] args) {
		IPhone ip = new IPhone();
		
		Telefone telefone = ip;
		Navegador navegador = ip;
		Player player = ip;
		
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();
		
		navegador.adicionarNovaAba();
		navegador.exibirPagina();
		navegador.atualizarPagina();
		
		player.selecionarMusica();
		player.tocar();
		player.pausar();
		
		
		
	}
	
	

}
