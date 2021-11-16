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

import projetoPrincipal.ouvinte.ouvinteTelaAdmin;

@SuppressWarnings("serial")
public class janelaAdmin extends janelaPadrao {
	private JTextField campoNome;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	private JPasswordField confirmarSenha;
	
	public JTextField getCampoNome() {
		return campoNome;
	}
	public JTextField getCampoEmail() {
		return campoEmail;
	}
	public JTextField getCampoSenha() {
		return campoSenha;
	}
	public JTextField getConfirmarSenha() {
		return confirmarSenha;
	}
		public janelaAdmin() {
			super("Cadastrar Admim");
			
			txtMome();
			campoNome();
			
			
			txtEmail();
			txtSenha();
			txtSenha2();
			
			campoEmail();
			campoSenha();
			campoConfirmarSenha();
			
			box();
			box2();
			
			botaoEnter();
			
			
			setVisible(true);
			
		}
		private void box2() {
			JCheckBox checBox2 = new JCheckBox();
			checBox2.setBounds(370,300,200,30);
			checBox2.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					if(checBox2.isSelected()) {
						confirmarSenha.setEchoChar('\u0000');
					}else {
						confirmarSenha.setEchoChar('*');
					}
					
				}
			});
			add(checBox2);
			
		}
		private void box() {
			JCheckBox checBox = new JCheckBox();
			checBox.setBounds(370,240,200,30);
			checBox.addActionListener(new ActionListener() {			
				
				public void actionPerformed(ActionEvent e) {
					if(checBox.isSelected()) {
						campoSenha.setEchoChar('\u0000');
					}else {
						campoSenha.setEchoChar('*');
					}
					
				}
			});
			add(checBox);
			
		}
		
		private void campoNome() {
			campoNome = new JTextField();
			campoNome.setBounds(150,130,200,30);
			campoNome.setBorder(new LineBorder(Color.PINK, 2, true));
			add(campoNome);
			
		}
		private void txtMome() {
			JLabel txtNome = new JLabel();
			txtNome.setText("Nome");
			txtNome.setBounds(150,110,40,20);
			add(txtNome);		
		}
		private void txtSenha2() {
			JLabel senha2 = new JLabel();
			senha2.setText("Confirmar Senha");
			senha2.setBounds(150,285,100,20);
			add(senha2);
			
		}

		private void txtSenha() {
			JLabel senha = new JLabel();
			senha.setText("Senha");
			senha.setBounds(150,225,40,20);
			add(senha);
		}

		private void txtEmail() {
			JLabel email= new JLabel();
			email.setText("Email");
			email.setBounds(150,165,40,20);
			add(email);
		}
		
		private void campoEmail() {
			campoEmail = new JTextField();
			campoEmail.setBounds(150,180,200,30);
			campoEmail.setBorder(new LineBorder(Color.PINK, 2, true));
			add(campoEmail);
		}
		
		
		private void campoSenha() {
			campoSenha = new JPasswordField();
			
			campoSenha.setBounds(150,240,200,30);
			campoSenha.setBorder(new LineBorder(Color.PINK, 2, true));
			add(campoSenha);
			
		}
		private void campoConfirmarSenha() {
			confirmarSenha = new JPasswordField();		
			

			confirmarSenha.setBounds(150,300,200,30);
			confirmarSenha.setBorder(new LineBorder(Color.PINK, 2, true));
			add(confirmarSenha);
			
		}
		

		private void botaoEnter() {
			JButton botaoEnter = new JButton();
			botaoEnter.setText("Enter");
			botaoEnter.setBounds(200,340,100,30);
			ouvinteTelaAdmin ouvinterh = new ouvinteTelaAdmin (this);
			botaoEnter.addActionListener(ouvinterh);
			add(botaoEnter);
			
		}

}
