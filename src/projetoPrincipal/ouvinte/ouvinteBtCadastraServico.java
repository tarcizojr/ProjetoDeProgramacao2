package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetoPrincipal.tela.janelaMenu;
import projetoPrincipal.tela.janelaServico;

public class ouvinteBtCadastraServico implements ActionListener {
	private janelaMenu janela;
	
	public janelaMenu getJanela() {
		return janela;
	}
	
	public ouvinteBtCadastraServico (janelaMenu janela) {
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent clique) {
		janela.dispose();
		janelaServico cadastraServico = new janelaServico();
		
	}

}
