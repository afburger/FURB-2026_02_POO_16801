package exemplos.unidade04.generalizacao;

public class NotificacaoWhatsApp extends NotificacaoSms {

    private String nomeUsuario;

    public NotificacaoWhatsApp(String destinatario, String mensagem, String numeroCelular, String usuario) {
        super(destinatario, mensagem, numeroCelular);
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    @Override
    public void enviarNotificacao() {
        System.out.println("Envio via WhatsAPP");
    }

}
