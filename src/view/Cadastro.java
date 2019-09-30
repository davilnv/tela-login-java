package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Cadastro extends TelaGenerica{
	
	private JTextField tfLogin;
	private JPasswordField tfSenha, tfConfirmarSenha;
	private JLabel lblLogin, lblSenha, lblConfirmarSenha;
	private JButton btnCadastrar;

	public Cadastro(String titulo) {
		super(titulo, 150, 270);
		
		tfLogin = new JTextField(10);
		tfSenha = new JPasswordField(10);
		tfConfirmarSenha = new JPasswordField(10);
		
		lblLogin = new JLabel("Login: ");
		lblSenha = new JLabel("Senha: ");
		lblConfirmarSenha = new JLabel("Confirmar senha: ");
		
		btnCadastrar = new JButton("Cadastrar");
		
		add(lblLogin);
		add(tfLogin);
		add(lblSenha);
		add(tfSenha);
		add(lblConfirmarSenha);
		add(tfConfirmarSenha);
		add(btnCadastrar);
		
		setVisible(true);
	}

	public JTextField getTfLogin() {
		return tfLogin;
	}

	public JPasswordField getTfSenha() {
		return tfSenha;
	}

	public JPasswordField getTfConfirmarSenha() {
		return tfConfirmarSenha;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}
	
}
