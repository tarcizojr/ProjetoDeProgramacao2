package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetoPrincipal.tela.janelaMandarEmail;
import projetoPrincipal.tela.janelaMenu;

public class ouvinteEnviarEmailMenu implements ActionListener {
	private janelaMenu janela;
	
    public ouvinteEnviarEmailMenu(janelaMenu janela) {
    	this.janela = janela;
}

	public void actionPerformed(ActionEvent clique) {
		janela.dispose();
		janelaMandarEmail janelaEmail = new janelaMandarEmail();
		
		
	}

}
