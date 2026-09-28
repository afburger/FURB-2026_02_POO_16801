package exemplos.unidade04.generalizacao;

public class NotificacaoEmail extends Notificacao {

    private String email;

    public NotificacaoEmail(String destinatario, String mensagem, String email) {
        super(destinatario, mensagem);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public void enviarNotificacao() {
        System.out.println("Envio via APP");
    }
}
