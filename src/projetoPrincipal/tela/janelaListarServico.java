package projetoPrincipal.tela;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import projetoPrincipal.Servico;
import projetoPrincipal.centralDeInformacoes;
import utilidades.util;

public class janelaListarServico extends janelaPadrao {
	centralDeInformacoes rh = util.xml();

	public janelaListarServico () {
		super("Listar");
		listarServico();
		setVisible(true);
		
	}
	

	
	public void listarServico() {	
		
		String [] colunas = {"Nome", "Descrição", "Duração"};
		DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);

		for (Servico ser : rh.getTodosOsServicos() ) {
			Object[] linha = new Object [3];
			linha[0] = ser.getNome();
			linha[1] = ser.getDescricao();
			linha[2] = ser.getDuracaoMedia();
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
