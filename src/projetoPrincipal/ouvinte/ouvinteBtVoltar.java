package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import projetoPrincipal.tela.janelaMenu;

public class ouvinteBtVoltar implements ActionListener {
private JFrame janela;
	
	public ouvinteBtVoltar(JFrame janela) {
		this.janela = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bo = (JButton) e.getSource();	

		if(bo.getText().equals("") && !(janela instanceof janelaMenu)) {
			janela.dispose();
			new janelaMenu();
		}

	}
}
