package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import projeto.Exception.EmailInvalidoException;
import projeto.Exception.telefoneInvalidoException;
import projetoPrincipal.Colaborador;
import projetoPrincipal.Sexo;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaColaborador;
import utilidades.util;
import utilidades.validacaoSistema;

public class ouvinteDoBtSalvarColaborador implements ActionListener {
private janelaColaborador janela;
	
	
	public ouvinteDoBtSalvarColaborador (janelaColaborador janela) {
		this.janela = janela;
	}

	public void actionPerformed(ActionEvent clique) {
		centralDeInformacoes rh = util.xml();
		String nome = janela.getTextNome().getText();
		String email = janela.getTextEmail().getText();
		String telefone = janela.getTextTelefone().getText();
		String sexo = (String) janela.getTextSexo().getSelectedItem();
		Sexo SexoColaborador = null;
		
		if (sexo.equals("Masculino")) {
			SexoColaborador = Sexo.HOMEM;
		}
		if (sexo.equals("Feminino")) {
			SexoColaborador = Sexo.MULHER;
			
		}if(sexo.equals("Outros")) {			
			SexoColaborador = Sexo.OUTROS;
		}
		
		try {
			validacaoSistema.validarEmail(email);
			validacaoSistema.validarTelefone(telefone);
			
			Colaborador pessoa = new Colaborador(nome, telefone, SexoColaborador, email);
			
			rh.adicionarColaborador(pessoa);
			util.xmlSalvar(rh);
			
			JOptionPane.showMessageDialog(janela, "Colaborador Cadastrado!!");
			
		} catch (EmailInvalidoException e) {
			JOptionPane.showMessageDialog(janela, "Email Invalido");
			
		} catch (telefoneInvalidoException e) {
			JOptionPane.showMessageDialog(janela, "Telefone Invalido");
		}
}
}
