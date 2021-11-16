package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import projetoPrincipal.Colaborador;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaMandarEmail;
import utilidades.Mensageiro;
import utilidades.Persistencia;
import utilidades.util;

public class ouvinteDoBtEmail implements ActionListener {
	private janelaMandarEmail janela;

	
	public ouvinteDoBtEmail (janelaMandarEmail janela) {
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent clique) {
		centralDeInformacoes rh = util.xml();
		Mensageiro mensagem = new Mensageiro();
		String titulo = janela.getTfTitulo().getText();
		String mensagemEmail = janela.getTfEmail().getText();
		for (Colaborador emailColaboradores  : rh.getTodosOsColaboradores() ) {
			mensagem.enviarMensagemAoColaborador(emailColaboradores.getEmail() ,titulo, mensagemEmail);
		}
		JOptionPane.showMessageDialog(janela, "Email Enviado!!");
		
	}

}
