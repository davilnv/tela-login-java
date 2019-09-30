package app;

import controller.Controle;
import model.BaseDeDados;
import model.Usuario;
import view.Cadastro;
import view.Login;

public class App {
	public static void main(String[] args) {
		BaseDeDados baseDeDados = new BaseDeDados();
//		Usuario usuario = new Usuario("davilnv", "1234");
//		baseDeDados.addUsuario(usuario);
		Login login = new Login("Login");
		Cadastro cadastro = new Cadastro("Cadastro");
		new Controle(login, cadastro ,baseDeDados);
	}
}
