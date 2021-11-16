package utilidades;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mensageiro {
	
    public void enviarMensagemAoColaborador(String emailc, String as , String msg) {
        
        String senha="claytonads@p2";
        String emailRemetente = "projetoadsp02@gmail.com";
        String emailDestino = emailc;
        String assunto = as;

        String mensagem = msg;

        Properties props = new Properties();
        props.put("mail.smtp.user", emailRemetente);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "25");
        props.put("mail.debug", "false");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.EnableSSL.enable","true");

        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(emailRemetente, senha);
                    }
                });

        session.setDebug(false);
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailRemetente));

            Address[] toUser = InternetAddress.parse(emailDestino);
            message.setRecipients(Message.RecipientType.TO,toUser);
            message.setSubject(assunto);
            message.setText(mensagem);
            Transport.send(message);

        }catch(Exception e){
            System.out.println("Erro ao enviar Email");

        }

    }

    
}