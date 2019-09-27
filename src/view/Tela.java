package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame{
	
	private JTextField tfLogin, tfSenha;
	private JLabel lblLogin, lblSenha;
	private JButton btnOK;
	
	public Tela() {
		super("Login");
		setSize(200, 200); // Escolher tamanho da janela
		setLocationRelativeTo(null); // Escolher a janela para iniciar no Centro
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Padrão para encerrar processo ao fechar janela
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); //Alinhamento e espaçamento do Layout
		
		tfLogin = new JTextField(10); // Parâmetro define o tamanho do JTextField
		tfSenha = new JTextField(10);
		
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

	public JTextField getTfSenha() {
		return tfSenha;
	}

	public JButton getBtnOK() {
		return btnOK;
	}
}
