package exemplos.unidade04.generalizacao;

public class NotificacaoApp extends Notificacao {

    public NotificacaoApp(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviarNotificacao() {
       System.out.println("Envio via APP");
    }

}
