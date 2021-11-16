package projetoPrincipal.tela;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class janelaEsqueceuSenha extends janelaPadrao {
	
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	private JPasswordField confirmarSenha;
	

	public JTextField getCampoEmail() {
		return campoEmail;
	}

	public JPasswordField getCampoSenha() {
		return campoSenha;
	}
	public JPasswordField getConfirmarSenha() {
		return confirmarSenha;
	}

	public janelaEsqueceuSenha() {
		super("Esqueceu a Senha");
		
		txtEmail();
		txtSenha();
		txtSenha2();
		
		campoEmail();
		campoSenha();
		campoConfirmarSenha();
		
		botaoEnter();
		
		
		setVisible(true);
	}


	private void txtSenha2() {
		JLabel senha2 = new JLabel();
		senha2.setText("Confirmar Senha");
		senha2.setBounds(150,260,100,20);
		add(senha2);
		
	}

	private void txtSenha() {
		JLabel senha = new JLabel();
		senha.setText("Senha");
		senha.setBounds(150,200,40,20);
		add(senha);
	}

	private void txtEmail() {
		JLabel email= new JLabel();
		email.setText("Email");
		email.setBounds(150,140,40,20);
		add(email);
	}
	
	private void campoEmail() {
		campoEmail = new JTextField();
		campoEmail.setBounds(150,160,200,30);
		campoEmail.setBorder(new LineBorder(Color.PINK, 2, true));
		add(campoEmail);
	}
	
	
	private void campoSenha() {
		campoSenha = new JPasswordField();		
		campoSenha.setBounds(150,220,200,30);
		campoSenha.setBorder(new LineBorder(Color.PINK, 2, true));
		add(campoSenha);
		
	}
	private void campoConfirmarSenha() {
		confirmarSenha = new JPasswordField();		
		confirmarSenha.setBounds(150,280,200,30);
		confirmarSenha.setBorder(new LineBorder(Color.PINK, 2, true));
		add(confirmarSenha);
		
	}
	

	private void botaoEnter() {
		JButton botaoEnter = new JButton();
		botaoEnter.setText("Enter");
		botaoEnter.setBounds(200,320,100,20);
		add(botaoEnter);
		
	}


	

}
