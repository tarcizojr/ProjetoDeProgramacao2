package projetoPrincipal.tela;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class janelaNovaTarefa extends janelaPadrao {
	
	public janelaNovaTarefa() {
		super("Nova Tarefa");
		adicionarTitulo();
		adicionarLabel();//texto
		adicionarCampoDeTexto(); //recebe texto
		setVisible(true);
	}

	private void adicionarCampoDeTexto() {
		JTextField titulo = new JTextField();
		titulo.setBounds(75,75,265,30);
		add(titulo);
		
	}

	//Texto
	private void adicionarTitulo() {
		ImageIcon i = new ImageIcon("C:\\Users\\TJ\\eclipse-workspace\\P2\\icon\\icons-brasil.png");
		JLabel jbCabecalho = new JLabel("To Do List", i,JButton.CENTER);
		jbCabecalho.setBounds(0,20,400,30);
		//jbTitulo.setHorizontalAlignment(JLabel.CENTER);
		jbCabecalho.setBackground(Color.YELLOW); //cor de fundo
		jbCabecalho.setFont(new Font("Arial", Font.BOLD, 20)); //fonte
		jbCabecalho.setForeground(Color.BLACK); //cor da letra
		jbCabecalho.setOpaque(true);
		jbCabecalho.setToolTipText("Projeto de fins academicos");
		add(jbCabecalho);
		
	}
	
	//Textos
	private void adicionarLabel() {
		JLabel jbTitulo = new JLabel("Titulo"); //o texto
		jbTitulo.setBounds(30, 75, 35, 30); //aparecer apartir de, distancia do topo, comprimento, altura
		jbTitulo.setOpaque(true);
		jbTitulo.setBackground(Color.RED);

		add(jbTitulo);
		
	}
}
