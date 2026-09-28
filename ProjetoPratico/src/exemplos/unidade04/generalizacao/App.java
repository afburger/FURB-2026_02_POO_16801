package exemplos.unidade04.generalizacao;

public class App {

    public static void main(String[] args) {
        NotificacaoWhatsApp wpp = new NotificacaoWhatsApp("André", "Corrigir provas", "999999", "afburger");

        Notificacao not = new Notificacao("André", "Mensagem") {
            @Override
            public void enviarNotificacao() {
                System.out.println("Envio de notifiação");
            }
        };

    }

}
