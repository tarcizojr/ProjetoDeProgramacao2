package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import projetoPrincipal.tela.janelaListar;
import projetoPrincipal.tela.janelaMenu;
import projetoPrincipal.tela.janelaNovo;
import projetoPrincipal.tela.janelaPadrao;

public class ouvinteMenuBar implements ActionListener{
	
	private JFrame janela;
	
	public ouvinteMenuBar(janelaPadrao janela) {
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent e) {
	
		switch (e.getActionCommand()) {
		case "Listar":
			if(!(janela instanceof janelaListar)) {				
				janela.dispose();				
				new janelaListar();
				
			}
			break;
		case "Menu":
			if(!(janela instanceof janelaMenu)) {
				janela.dispose();				
				new janelaMenu();
			}
			break;
	/*	case "Buscar Agendamento":
			if(!(janela instanceof BuscarAgendamento)) {
				janela.dispose();				
				new BuscarAgendamento();
				break;
			} */
		case "Novo":
			if(!(janela instanceof janelaNovo)) {
				janela.dispose();				
				new janelaNovo();
				break;
			}
		case "Sair":
			if(!(janela instanceof janelaNovo)) {
				janela.dispose();				
				
				break;
			}
			
		}
	}
	

}

