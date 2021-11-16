package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import projetoPrincipal.Colaborador;
import projetoPrincipal.Funcao;
import projetoPrincipal.Servico;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaAssociar;
import utilidades.util;

public class ouvinteBtAssociar implements ActionListener {
	private janelaAssociar janela;
	
	public janelaAssociar getJanela() {
		return janela;
	}
	
	public ouvinteBtAssociar  (janelaAssociar janela) {
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent clique) {
		centralDeInformacoes rh = util.xml();
		Funcao fu = new Funcao();
		Servico nomeServico = (Servico) janela.getComboBoxServico().getSelectedItem();
		fu.setSercol(nomeServico);
		
		Funcao fuaux = new Funcao (fu);
		Colaborador Colaborador = (Colaborador) janela.getComboBoxColaborador().getSelectedItem();
				
		if (rh.associar(Colaborador.getEmail(), fu.getSercol().getId()) == true) {
			fuaux.setCol(Colaborador);
			rh.getListaDePares().add(fuaux);	
		}
	
		util.xmlSalvar(rh);
		JOptionPane.showMessageDialog(janela, "Colaborador associado ao Serviço!!");
	
	}
}
