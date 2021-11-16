package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import projeto.Exception.EmailInvalidoException;
import projeto.Exception.NomeInvalidoException;
import projeto.Exception.SenhaInvalidaException;
import projetoPrincipal.Administrador;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaAdmin;
import utilidades.util;
import utilidades.validacaoSistema;

public class ouvinteTelaAdmin implements ActionListener {
	private janelaAdmin janela;
	
	public ouvinteTelaAdmin (janelaAdmin janela) {
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent clique)  {
		centralDeInformacoes rh = util.xml();
		try {
		if (janela.getCampoSenha().getText().equals(janela.getConfirmarSenha().getText())) {
		String nome = janela.getCampoNome().getText();
		validacaoSistema.validarNome(nome);
		String email = janela.getCampoEmail().getText();
		validacaoSistema.validarEmail(email);
		String senha = janela.getCampoSenha().getText();
		validacaoSistema.validarSenha(senha);
		Administrador admin = new Administrador(nome, email, senha);
		rh.setAdmin(admin);
		util.xmlSalvar(rh);	
		JOptionPane.showMessageDialog(janela, "Administrador Cadastrado!!");
	}
		}catch (NomeInvalidoException e) {
			JOptionPane.showMessageDialog(janela, "Nome Invalido!!");
		}
		catch (EmailInvalidoException e) {
			JOptionPane.showMessageDialog(janela, "Email Invalido!!");
		}
		catch (SenhaInvalidaException e) {
			JOptionPane.showMessageDialog(janela, "Senha Invalido!!");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(janela, "Administrador não Cadastrado!!");
		}
	

    }
}