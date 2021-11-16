package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import projetoPrincipal.tela.janelaAgendamento;

public class ouvinteJanelaMenu implements ActionListener {
private JFrame janela;
	
	public ouvinteJanelaMenu(JFrame janela) {
		this.janela = janela;
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();		
		if(botao.getText().equals("Agendamento")) {
			janela.dispose();
			new janelaAgendamento();
		}else if(botao.getText().equals("Relatório")) {
			JOptionPane.showMessageDialog(null, "Botão não Configurado");
		}else if(botao.getText().equals("Buscar Serviço")) {
			JOptionPane.showMessageDialog(null, "Botão não Configurado");
		}else if(botao.getText().equals("Adicionar Colaborador a Serviço")) {
			JOptionPane.showMessageDialog(null, "Botão não Configurado");
		}else if(botao.getText().equals("Enviar email ao colaboradores")) {
			JOptionPane.showMessageDialog(null, "Botão não Configurado");
		}
		
	}
}
