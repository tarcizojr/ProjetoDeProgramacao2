package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetoPrincipal.tela.janelaColaborador;
import projetoPrincipal.tela.janelaMenu;

public class ouvinteBtCadastraColaborador implements ActionListener {
	
	private janelaMenu janela;
	
	public janelaMenu getJanela() {
		return janela;
	}
	
	public ouvinteBtCadastraColaborador (janelaMenu janela) {
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent clique) {
		janela.dispose();
		janelaColaborador CadastroColaborador = new janelaColaborador ();
		
	}


	

}
