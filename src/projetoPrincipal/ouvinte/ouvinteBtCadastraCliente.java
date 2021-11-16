package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import projeto.Exception.EmailInvalidoException;
import projeto.Exception.NomeInvalidoException;
import projetoPrincipal.Cliente;
import projetoPrincipal.centralDeInformacoes;
import projetoPrincipal.tela.janelaNovoCliente;
import utilidades.util;
import utilidades.validacaoSistema;

public class ouvinteBtCadastraCliente implements ActionListener  {

    private janelaNovoCliente janela;

    public janelaNovoCliente getJanela() {
        return janela;
    }

    public ouvinteBtCadastraCliente (janelaNovoCliente janela) {
        this.janela = janela;
    }
    public void actionPerformed(ActionEvent e) {
        centralDeInformacoes rh = util.xml();
        try {
        String nome = janela.getNomeCliente().getText();
        validacaoSistema.validarNome(nome);
        String email = janela.getEmailCliente().getText();
        validacaoSistema.validarEmail(email);
        Cliente cliente = new Cliente (nome , email);
        rh.adicionarCliente(cliente);
        util.xmlSalvar(rh);
        JOptionPane.showMessageDialog(janela, "Cliente Cadastrado!!");
        
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(janela, "Nome invalido!");
        } catch (EmailInvalidoException ex) {
            JOptionPane.showMessageDialog(janela, "Email invalido!");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(janela, "Cliente não cadastrado!");
        }

}
}
