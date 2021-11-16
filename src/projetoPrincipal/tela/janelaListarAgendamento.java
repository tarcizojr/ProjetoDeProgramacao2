package projetoPrincipal.tela;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import projetoPrincipal.Agendamento;
import projetoPrincipal.centralDeInformacoes;
import utilidades.util;

public class janelaListarAgendamento extends janelaPadrao {
	centralDeInformacoes rh = util.xml(); 
	public janelaListarAgendamento() {
		super("Lista de Agendamentos");
		listarAgendamentos();
		setVisible(true);
	}

	private void listarAgendamentos() {
		String [] colunas = {"Cliente", "Data", "Hora", "Serviço"};
		DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);

		for (Agendamento ag : rh.getListaDeAgendamento() ) {
			Object[] linha = new Object [4];
			linha[0] = ag.getCli().getNome();
			linha[1] = ag.getDia();
			linha[2] = ag.getHora();
			linha[3] = ag.getFu();
			tableModel.addRow(linha);
		}
		
		
		JTable tabelaColaboradores = new JTable(tableModel);
		
		
		tabelaColaboradores.setBounds(25,30,450,50);	
		tabelaColaboradores.setDefaultEditor(Object.class, null);

		
		JScrollPane jscrol = new JScrollPane(tabelaColaboradores);
		jscrol.setEnabled(false);
		jscrol.setBounds(25,45,450,100);
		
			
		
		add(jscrol);
		
	}

}
