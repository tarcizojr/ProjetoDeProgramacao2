package projetoPrincipal.tela;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import projetoPrincipal.ouvinte.ouvinteBtCadastraCliente;

public class janelaNovoCliente extends janelaPadrao {
	 private JTextField EmailCliente;
	 private JTextField NomeCliente;
	 
	public JTextField getEmailCliente() {
		return EmailCliente;
	}

	public JTextField getNomeCliente() {
		return NomeCliente;
	}

		public janelaNovoCliente() {
	      super("Cadastrar Cliente");
	        adicionarLabel();
	        adicionarTextField();
	        adicionarLabel2();
	        adicionarTextField2();
	      
	        adicionarLabel4();
	        adicionarComboBox();
	        adicionarBotao();
	        
	     
	        
	        setVisible(true);
	        
	    }
	  
		public void adicionarLabel() {
	        JLabel texto = new JLabel("Email:");
	        
	        texto.setBounds(127, 100, 140, 44);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarTextField () {
	        EmailCliente = new JTextField();
	    
	        
	        EmailCliente.setBorder(new LineBorder(Color.PINK, 2, true));
	        EmailCliente.setBounds(127, 130, 250, 44);
	        EmailCliente.setEnabled(true);
	        
	        add(EmailCliente);
	    }
	    public void adicionarLabel2 () {
	        JLabel texto = new JLabel("Nome do Cliente: ");
	        
	        texto.setBounds(127, 180, 140, 44);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarTextField2 () {
	        NomeCliente = new JTextField();
	        
	        
	        NomeCliente.setBorder(new LineBorder(Color.PINK, 2, true));
	        NomeCliente.setBounds(127, 210, 250, 44);
	        NomeCliente.setEnabled(true);
	        
	        add(NomeCliente);
	    }

	    public void adicionarLabel4 () {
	        JLabel texto = new JLabel("Sexo: ");
	        
	        texto.setBounds(127, 260, 230, 60);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    private void adicionarComboBox() {
	        String[] opcoes = {"Masculino", "Feminino", "Outro"};
	        JComboBox<String> comboBox = new JComboBox<String>(opcoes);
	        comboBox.setBorder(new LineBorder(Color.PINK, 2, true));
	        comboBox.setBounds(127, 300, 250, 44);
	        add(comboBox);
	    }
	    public void adicionarBotao () {
	        
	        JButton botao = new JButton("Salvar");
	       
	        botao.setBounds(210, 400, 90, 44);
	        botao.setToolTipText("Clique Para Confirmar");
	        ouvinteBtCadastraCliente ouvinteCliente = new ouvinteBtCadastraCliente (this);
	        botao.addActionListener(ouvinteCliente);
	        add(botao);
}
}
