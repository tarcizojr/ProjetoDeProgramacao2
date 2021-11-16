package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetoPrincipal.tela.janelaAssociar;
import projetoPrincipal.tela.janelaMenu;

public class ouvinteDoBtAdicionarServico implements ActionListener {
	private janelaMenu janela;
	
	public janelaMenu getJanela() {
		return janela;
	}
	
	public ouvinteDoBtAdicionarServico (janelaMenu janela) {
		this.janela = janela;
	}

	public void actionPerformed(ActionEvent clique) {
		janela.dispose();
		janelaAssociar janela = new janelaAssociar();
	}

}
