package model;

import java.util.ArrayList;

public class BaseDeDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public boolean addUsuario(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (user.equals(usuario))
				return false;
		}
		return usuarios.add(usuario);
	}
	
	public boolean buscar(String login, String senha) {
		for (Usuario user : usuarios) {
			if (login.equalsIgnoreCase(user.getLogin()) && senha.equals(user.getSenha()))
				return true;
		}
		return false;
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
}
