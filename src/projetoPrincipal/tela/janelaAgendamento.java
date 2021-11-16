package projetoPrincipal.tela;

import java.awt.Color;


import javax.swing.JButton;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import projetoPrincipal.Colaborador;
import projetoPrincipal.Funcao;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.ouvinte.ouvinteBotoes;
import projetoPrincipal.ouvinte.ouvinteDoAgendamento;
import utilidades.util;



@SuppressWarnings("serial")
public class janelaAgendamento extends janelaPadrao {
	centralDeInformacoes rh = util.xml();
	private JTextField email;
	private JFormattedTextField data;
	private JTable tabelaFuncao;
	private JFormattedTextField hora;
	
	public JTextField getEmail() {
		return email;
	}



	public JFormattedTextField getData() {
		return data;
	}



	public JTable getTabelaFuncao() {
		return tabelaFuncao;
	}



	public JFormattedTextField getHora() {
		return hora;
	}



	public janelaAgendamento( ) {
		super("Agendamento");
		
		txtEmail();
		campoEmail();
		
		listarSer();
		
		txtData();
		campoData();
		
		txtHota();
		campoHora();
		
		bt();
		
		setVisible(true);
	}
	
	

	private void listarSer() {
		
		
		String [] colunas = {"Colaborador", "Serviço" };
		DefaultTableModel tableModel = new DefaultTableModel(colunas, 0);

		for (Funcao fu : rh.getListaDePares() ) {
			Object[] linha = new Object [2];
			linha[0] = fu.getCol();
			linha[1] = fu.getSercol();
 			tableModel.addRow(linha);
		}
		
		
		tabelaFuncao = new JTable(tableModel);
		
		tabelaFuncao.setBounds(25,30,450,50);	
		tabelaFuncao.setDefaultEditor(Object.class, null);

		
		JScrollPane jscrol = new JScrollPane(tabelaFuncao);
		jscrol.setEnabled(false);
		jscrol.setBounds(25,45,450,100);
		
			
		
		add(jscrol);
		
	}



	private void bt() {
		JButton botao = new JButton("Salvar");
        
        botao.setBounds(210, 400, 90, 44);
        botao.setToolTipText("Clique Para Confirmar");
        botao.addActionListener(null);
        botao.addMouseListener(new ouvinteBotoes(botao));
        botao.addActionListener(new ouvinteDoAgendamento(this));

       
        add(botao);
}



	private void campoHora() {
		try {
			MaskFormatter mascara = new MaskFormatter("##:##");
			hora = new JFormattedTextField(mascara);
			hora.setHorizontalAlignment(JLabel.CENTER);
			hora.setBounds(180, 330, 90, 44);
			hora.setBorder(new LineBorder(Color.PINK, 2, true));
			add(hora);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		
	}



	private void txtHota() {
		JLabel txthora = new JLabel();
		txthora.setText("Hora");
		txthora.setBounds(180, 300, 90, 44);
		add(txthora);
		
	}



	private void txtData() {
		JLabel txtdata = new JLabel();
		txtdata.setText("Data");
		txtdata.setBounds(60, 300, 90, 44);
		add(txtdata);
		
	}



	private void campoData() {
		try {
			MaskFormatter mascara = new MaskFormatter("## / ## / ####");
			data = new JFormattedTextField(mascara);
			data.setHorizontalAlignment(JLabel.CENTER);
			data.setBounds(60, 330, 100, 44);
			data.setBorder(new LineBorder(Color.PINK, 2, true));
			add(data);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}



	
	private void txtEmail() {
		JLabel email= new JLabel();
		email.setText("Email do Cliente ");
		email.setBounds(150,230,100,44);
		add(email);
		
	}

	private void campoEmail() {
		email = new JTextField();
		email.setBounds(150,260,200,44);
		email.setBorder(new LineBorder(Color.PINK, 2, true));
		add(email);
	}

}
