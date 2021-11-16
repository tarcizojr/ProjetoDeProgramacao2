package projetoPrincipal.tela;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import projetoPrincipal.Colaborador;
import projetoPrincipal.Servico;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.ouvinte.ouvinteBtAssociar;
import utilidades.Persistencia;

@SuppressWarnings("serial")
public class janelaAssociar extends janelaPadrao {
	private JComboBox<?> comboBoxServico;
	private JComboBox<?> comboBoxColaborador;
	
	public JComboBox<?> getComboBoxServico() {
		return comboBoxServico;
	}
	public JComboBox<?> getComboBoxColaborador() {
		return comboBoxColaborador;
	}
	
	  public janelaAssociar () {
	        super("Adicionar Serviço ao Colaborador");
	        adicionarLabel();
	        adicionarComboBox();
	        adicionarLabel2();
	        adicionarComboBox2();
	        adicionarBotao();
	        setVisible(true);
	    }
	    public void adicionarLabel() {
	        JLabel texto = new JLabel("Serviço:");

	        texto.setBounds(127, 80, 150, 40);
	        texto.setForeground(Color.black);

	        add(texto);
	    }

	    private void adicionarComboBox() {
			Persistencia xml = new Persistencia ();
			centralDeInformacoes rh = xml.recuperarCentral();
			Servico [] servicos = new Servico [rh.getListaDeServico().size()];
			 for (int i = 0; i < rh.getTodosOsColaboradores().size(); i++) {
					servicos[i] = rh.getListaDeServico().get(i);
				}
	        comboBoxServico = new JComboBox<Servico>(servicos);
	        comboBoxServico.setBorder(new LineBorder(Color.PINK, 2, true));
	        comboBoxServico.setBounds(127, 110, 250, 30);
	        add(comboBoxServico);
	    }
	    public void adicionarLabel2() {
	        JLabel texto = new JLabel("Colaborador:");

	        texto.setBounds(127, 200, 150, 40);
	        texto.setForeground(Color.black);

	        add(texto);
	    }
	    private void adicionarComboBox2() {
			Persistencia xml = new Persistencia ();
			centralDeInformacoes rh = xml.recuperarCentral();
	        Colaborador[] colaboradores = new Colaborador [rh.getTodosOsColaboradores().size()];
	        for (int i = 0; i < rh.getTodosOsColaboradores().size(); i++) {
				colaboradores[i] = rh.getTodosOsColaboradores().get(i);
			}
	        comboBoxColaborador = new JComboBox<Colaborador>(colaboradores);
	        comboBoxColaborador.setBorder(new LineBorder(Color.PINK, 2, true));
	        comboBoxColaborador.setBounds(127, 230, 250, 30);
	        add(comboBoxColaborador);
	    }
	    public void adicionarBotao () {

	        JButton botao = new JButton("Associar");
	        botao.setBounds(210, 350, 90, 35);
	        botao.setToolTipText("Clique Para Confirmar");
	        
	        ouvinteBtAssociar ouvinte = new ouvinteBtAssociar(this);
	        botao.addActionListener(ouvinte);
	        add(botao);
	    }
		

}
