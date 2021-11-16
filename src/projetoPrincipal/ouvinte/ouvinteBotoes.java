package projetoPrincipal.ouvinte;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class ouvinteBotoes implements MouseListener {
	private JButton botao;
	
	public ouvinteBotoes(JButton botao) {
		this.botao = botao;
		botao.setBackground(new Color(255,192,203));
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}

	
	public void mousePressed(MouseEvent e) {
	
	}


	public void mouseReleased(MouseEvent e) {
	
	}


	public void mouseEntered(MouseEvent e) {
		botao.setBackground(new Color(219,112,147));
	}

	public void mouseExited(MouseEvent e) {
		botao.setBackground(new Color(255,192,203));
		
	}

}