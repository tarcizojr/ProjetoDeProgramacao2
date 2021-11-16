package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import projetoPrincipal.Servico;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaServico;
import utilidades.util;
public class ouvinteDoBtSalvarServico implements ActionListener {
	
	private janelaServico janela;
	
	
	public janelaServico getJanela() {
		return janela;
	}
	public ouvinteDoBtSalvarServico (janelaServico janela) {
		this.janela = janela;
	}

	public void actionPerformed(ActionEvent clique) {
		centralDeInformacoes rh = util.xml();
		String nome = janela.getTextFieldNome().getText();
		String descricao = janela.getTextDescricao().getText();
		int  duracao = Integer.parseInt(janela.getTextFieldNumber().getText());
		
		Servico servico = new Servico(nome, descricao, duracao );
		
		rh.adicionarServico(servico);
		
		util.xmlSalvar(rh);
		
		JOptionPane.showMessageDialog(janela, "Serviço Cadastrado!!");
	}


}
