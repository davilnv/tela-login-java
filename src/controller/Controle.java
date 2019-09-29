package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDeDados;
import view.Tela;

public class Controle implements ActionListener{
	private Tela tela;
	private BaseDeDados baseDeDados;
	
	public Controle(Tela tela, BaseDeDados baseDeDados) {
		this.tela = tela;
		this.baseDeDados = baseDeDados;
		
		tela.getBtnOK().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (baseDeDados.buscar(tela.getTfLogin().getText(), tela.getTfSenha().getText()))
			JOptionPane.showMessageDialog(null, "Logado com Sucesso!");
		else
			JOptionPane.showMessageDialog(null, "Não logado, login ou senha incorreto");
	}
}
