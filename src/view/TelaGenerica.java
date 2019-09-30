package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame{
	
	public TelaGenerica(String titulo, int largura, int altura) {
		super(titulo);
		setSize(largura, altura); // Escolher tamanho da janela
		setLocationRelativeTo(null); // Escolher a janela para iniciar no Centro
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Padrão para encerrar processo ao fechar janela
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setVisible(false);
	}
}
