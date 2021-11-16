package projetoPrincipal.tela;

import projetoPrincipal.centralDeInformacoes;
import utilidades.util;

public class mainteste {
public static void main(String[] args) {
	centralDeInformacoes rh = util.xml();
	if (rh.getAdmin() != null) {
		new janelaLogin();
	}
	else {
		new janelaAdmin();
	}
  }
}
