package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import projetoPrincipal.tela.janelaEsqueceuSenha;
import projetoPrincipal.tela.janelaLogin;

public class ouvinteTelaLogin implements ActionListener {
	
	private janelaLogin tela;
	
	public ouvinteTelaLogin(janelaLogin tela) {
		this.tela = tela;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton bo =(JButton) e.getSource();
		
		if(bo.getText().equals("Esqueceu a Senha?")) {
			tela.dispose();		
			janelaEsqueceuSenha esqueceu = new janelaEsqueceuSenha();
			
		}
	}
}
