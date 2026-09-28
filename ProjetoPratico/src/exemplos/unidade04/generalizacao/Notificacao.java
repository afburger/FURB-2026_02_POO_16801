package exemplos.unidade04.generalizacao;

public abstract class Notificacao {

    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public abstract void enviarNotificacao();

}
