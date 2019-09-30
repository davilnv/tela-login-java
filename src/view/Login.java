package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends TelaGenerica{
	
	private JTextField tfLogin;
	private JPasswordField tfSenha;
	private JLabel lblLogin, lblSenha;
	private JButton btnOK;
	
	public Login(String titulo) {
		super(titulo, 200, 200);
		tfLogin = new JTextField(10); // Parâmetro define o tamanho do JTextField
		tfSenha = new JPasswordField(10);
		
		lblLogin = new JLabel("Login:");
		lblSenha = new JLabel("Senha:");
		
		btnOK = new JButton("OK");
		
		add(lblLogin);
		add(tfLogin);
		add(lblSenha);
		add(tfSenha);
		add(btnOK);
		
		setVisible(true);
	}

	public JTextField getTfLogin() {
		return tfLogin;
	}

	public JPasswordField getTfSenha() {
		return tfSenha;
	}

	public JButton getBtnOK() {
		return btnOK;
	}

}
