package utilidades;


import projetoPrincipal.centralDeInformacoes;

public class util {
	public static centralDeInformacoes xml () {
		Persistencia pe = new Persistencia ();
		centralDeInformacoes rh = pe.recuperarCentral();
		
		return rh;
	}
	
	public static void xmlSalvar (centralDeInformacoes rh) {
		Persistencia pe = new Persistencia ();
		pe.salvarCentral(rh);
	}

}
