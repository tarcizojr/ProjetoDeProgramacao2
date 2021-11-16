package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import projeto.Exception.EmailInvalidoException;
import projetoPrincipal.Agendamento;
import projetoPrincipal.Cliente;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaAgendamento;
import projetoPrincipal.tela.janelaMenu;
import utilidades.util;
import utilidades.validacaoSistema;

public class ouvinteDoAgendamento implements ActionListener {
	private janelaAgendamento janela;
	
	 public ouvinteDoAgendamento(janelaAgendamento janela) {
	    	this.janela = janela;
	}
		

	public void actionPerformed(ActionEvent e) {
	centralDeInformacoes rh = util.xml();
	
	try {
		validacaoSistema.validarEmail(janela.getEmail().getText());
		validacaoSistema.validarData(janela.getData().getText());
		validacaoSistema.validarHora(janela.getHora().getText());
		int i = janela.getTabelaFuncao().getSelectedRow();	
		for (Cliente cli : rh.getListaDeClientes()) {
			if (janela.getEmail().getText().equals(cli.getEmail())) {
				Agendamento agenda = new Agendamento(cli, janela.getData().getText(), janela.getHora().getText(), rh.getListaDePares().get(i) );
				rh.getListaDeAgendamento().add(agenda);
			}
		}
		util.xmlSalvar(rh);
		JOptionPane.showMessageDialog(janela, "Agendado com sucesso!!");
		
	} catch (EmailInvalidoException e2) {
		JOptionPane.showMessageDialog(janela, "Email não Cadastrado");
	} catch (Exception ex) {
		JOptionPane.showMessageDialog(janela, "Erro no agendamento!!");
	}

	
}
}

