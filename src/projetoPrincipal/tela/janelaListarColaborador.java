package projetoPrincipal.tela;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import projetoPrincipal.Colaborador;
import projetoPrincipal.centralDeInformacoes;
import utilidades.util;

public class janelaListarColaborador extends janelaPadrao {
	centralDeInformacoes rh = util.xml();

	public janelaListarColaborador () {
		super("Listar");
		listarColaboradores();
		setVisible(true);
		
	}
	

	
	public void listarColaboradores() {	
		
		String [] colunas = {"Nome", "Telefone", "Email"};
		DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);

		for (Colaborador col : rh.getTodosOsColaboradores() ) {
			Object[] linha = new Object [3];
			linha[0] = col.getNome();
			linha[1] = col.getTelefone();
			linha[2] = col.getEmail();
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
