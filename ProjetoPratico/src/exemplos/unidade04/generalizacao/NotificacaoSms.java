package exemplos.unidade04.generalizacao;

public class NotificacaoSms extends Notificacao {

    private String numeroCelular;

    public NotificacaoSms(String destinatario, String mensagem, String numeroCelular) {
        super(destinatario, mensagem);
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void enviarNotificacao() {  
        System.out.println("Envio via SMS");
    }

}
