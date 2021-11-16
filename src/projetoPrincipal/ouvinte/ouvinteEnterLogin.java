package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaLogin;
import projetoPrincipal.tela.janelaMenu;
import utilidades.util;
import utilidades.validacaoSistema;

public class ouvinteEnterLogin implements ActionListener {
	private janelaLogin janela;
	
	public ouvinteEnterLogin (janelaLogin janela) {
		this.janela = janela;
	}

	
	public void actionPerformed(ActionEvent e) {
		centralDeInformacoes rh = util.xml();
		String email = janela.getEmail().getText();
		String senha = janela.getSenha().getText();
		if (email.equals(rh.getAdmin().getEmail())&& senha.equals(rh.getAdmin().getSenha())) {
			janela.dispose();
			janelaMenu janela = new janelaMenu();
		}
		else {
			JOptionPane.showInputDialog(janela, "Login Invalido");
		}
  }
}