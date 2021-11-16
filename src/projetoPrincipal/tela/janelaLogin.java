package projetoPrincipal.tela;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import projetoPrincipal.ouvinte.ouvinteEnterLogin;
import projetoPrincipal.ouvinte.ouvinteTelaLogin;

@SuppressWarnings("serial")
public class janelaLogin extends janelaPadrao {
	
	private JTextField email;
	private JPasswordField senha;
	
	//----------------------

	public JPasswordField getSenha() {
		return senha;
	}


	public JTextField getEmail() {
		return email;
	}


	public janelaLogin() {
		super("Login");

		
		campoEmail();		
		txtEmail();
		
		campoSenha();
		txtSenha();
		
		botaoEnter();
		botaoEsqueceu();
		
		setVisible(true);
	}
	private final ouvinteTelaLogin ouvinteLogin = new ouvinteTelaLogin(this);

	private void botaoEsqueceu() {
		JButton botaoEsqueceu = new JButton();
		botaoEsqueceu.setText("Esqueceu a Senha?");
		botaoEsqueceu.setBounds(175, 295, 150, 20);
		botaoEsqueceu.setOpaque(false);
		botaoEsqueceu.setContentAreaFilled(false);
		botaoEsqueceu.setBorderPainted(false);
		
		box();
		
		botaoEsqueceu.addActionListener(ouvinteLogin);		
		add(botaoEsqueceu);
		
		
		
	}
	

	private void box() {
		JCheckBox checBox = new JCheckBox();
		checBox.setBounds(370,220,200,30);
		checBox.addActionListener((ActionListener) new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				if(checBox.isSelected()) {
					senha.setEchoChar('\u0000');
				}else {
					senha.setEchoChar('*');
				}
				
			}
		});
		add(checBox);
		
	}

	private void botaoEnter() {
		JButton botaoEnter = new JButton();
		botaoEnter.setText("Enter");
		botaoEnter.setBounds(200,265,100,30);	
		add(botaoEnter);
		ouvinteEnterLogin ouvinteEnter = new ouvinteEnterLogin(this);
		botaoEnter.addActionListener(ouvinteEnter);
		
	}

	private void txtSenha() {
		JLabel senha = new JLabel();
		senha.setText("Senha");
		senha.setBounds(150,200,40,20);
		add(senha);
		
	}

	private void campoSenha() {
		senha = new JPasswordField();
		
		senha.setBounds(150,220,200,30);
		senha.setBorder(new LineBorder(Color.PINK, 2, true));
		add(senha);
		
	}
	
	

	private void txtEmail() {
		JLabel email= new JLabel();
		email.setText("Email");
		email.setBounds(150,140,40,20);
		add(email);
		
	}

	private void campoEmail() {
		email = new JTextField();
		email.setBounds(150,160,200,30);
		email.setBorder(new LineBorder(Color.PINK, 2, true));
		add(email);
	}
}
