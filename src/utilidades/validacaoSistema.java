package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import projeto.Exception.DataInvalidaException;
import projeto.Exception.EmailInvalidoException;
import projeto.Exception.HoraInvalidaException;
import projeto.Exception.NomeInvalidoException;
import projeto.Exception.SenhaInvalidaException;
import projeto.Exception.telefoneInvalidoException;

public class validacaoSistema {
	
	public static void validarEmail(String s) throws EmailInvalidoException {
		boolean validar = s.matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
		if (validar == false) {
			throw new EmailInvalidoException ();
		}
	}
	public static void validarTelefone(String s) throws telefoneInvalidoException {
		boolean validar = s.matches("/^1\\d\\d(\\d\\d)?$|^0800 ?\\d{3} ?\\d{4}$|^(\\(0?([1-9a-zA-Z][0-9a-zA-Z])?[1-9]\\d\\) ?|0?([1-9a-zA-Z][0-9a-zA-Z])?[1-9]\\d[ .-]?)?(9|9[ .-])?[2-9]\\d{3}[ .-]?\\d{4}$/gm\r\n"
				+ "");
		if (validar == false) {
			throw new telefoneInvalidoException ();
		}
	}
	
	public static void validarNome (String s) throws NomeInvalidoException {
		
		for (int i = 0; i < s.length(); i++) { 
		    if (!Character.isAlphabetic((s.charAt(i)))) { 
		    	continue;
		        }
		    else {
		    	throw new NomeInvalidoException();
		    }
		}

		 
	}
	public static void validarSenha (String s) throws SenhaInvalidaException {
		boolean validar = s.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
		if (validar == false) {
			throw new SenhaInvalidaException ();
		}
	}
	public static void validarData (String data)throws DataInvalidaException {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                    .ofPattern("dd/MM/uuuu")
                   .withResolverStyle(ResolverStyle.STRICT);
                   try {
                       LocalDate date = LocalDate.parse(data, dateTimeFormatter);
                       throw new DataInvalidaException();
                   } catch (DataInvalidaException e) {
                      e.getMessage();
                   } 
   }
   public static void validarHora(String hora)throws HoraInvalidaException  {
       if(hora.equals("  :  ")) {
           throw new HoraInvalidaException();
       }else {
           String [] hF = hora.split(":");
           if(Integer.parseInt(hF[0]) < 8 || Integer.parseInt(hF[0]) > 12) {

               throw new HoraInvalidaException();
           }else if ((Integer.parseInt(hF[0]) > 12 || Integer.parseInt(hF[0]) > 19)) {
               throw new HoraInvalidaException();

           }else if(Integer.parseInt(hF[0]) == 12 && Integer.parseInt(hF[1]) == 59) {

               throw new HoraInvalidaException();
           }else if ((Integer.parseInt(hF[1]) > 60)) {
               throw new HoraInvalidaException();
           }
       }
}
}
