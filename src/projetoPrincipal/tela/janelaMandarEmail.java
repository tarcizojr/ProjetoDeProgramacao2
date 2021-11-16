package projetoPrincipal.tela;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import projetoPrincipal.ouvinte.ouvinteDoBtEmail;

@SuppressWarnings("serial")
public class janelaMandarEmail extends janelaPadrao {
	private JTextField tfTitulo;
	private JTextArea tfEmail;
	
	public JTextField getTfTitulo() {
		return tfTitulo;
	}

	public JTextArea getTfEmail() {
		return tfEmail;
	}

	public janelaMandarEmail() {
		super("Mandar Email");
		
		adicionarLabelTitulo();
		adicionarTextFieldsTitulo();
		adicionarLabelEmail();
		adicionarTextFieldsEmail();
		adicionarBotao();
	
	}
	private void adicionarLabelTitulo() {
		JLabel titulo = new JLabel("Digite o titulo do Email:");
		titulo.setBounds(100, 60, 140, 40);
		add(titulo);
	}
	
	private void adicionarTextFieldsTitulo() {
		tfTitulo = new JTextField();
		tfTitulo.setBounds(100, 100, 300, 35);
		tfTitulo.setBorder(new LineBorder(Color.PINK, 2, true));
		add(tfTitulo);
	}
	private void adicionarLabelEmail() {
		JLabel email = new JLabel("Digite o Email:");
		email.setBounds(100, 140, 140, 40);
		add(email);
	}
	private void adicionarTextFieldsEmail() {
		tfEmail = new JTextArea();
		tfEmail.setBounds(100, 180, 300, 60);
		tfEmail.setBorder(new LineBorder(Color.PINK, 2, true));
		add(tfEmail);
	}
	private void adicionarBotao() {
		JButton Enviar = new JButton("Enviar");
		Enviar.setBounds(100, 260 , 300 , 44);
		add(Enviar);
		ouvinteDoBtEmail ouvinte = new ouvinteDoBtEmail (this);
		Enviar.addActionListener(ouvinte);
	}

}
