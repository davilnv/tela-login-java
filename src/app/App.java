package app;

import controller.Controle;
import model.BaseDeDados;
import model.Usuario;
import view.Tela;

public class App {
	public static void main(String[] args) {
		BaseDeDados baseDeDados = new BaseDeDados();
		Usuario usuario = new Usuario("davilnv", "1234");
		baseDeDados.addUsuario(usuario);
		Tela tela = new Tela();
		new Controle(tela, baseDeDados);
	}
}
