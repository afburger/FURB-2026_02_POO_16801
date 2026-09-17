package provas.prova01;

public class App {
    public static void main(String[] args) throws Exception {
        Reservatorio r1 = new Reservatorio(1, "Caixa d'água bloco S", 5000);
        Reservatorio r2 = new Reservatorio(2, "ETA II", 20000, 15000);

        r1.encher(1000);

        r2.esvaziar(5000);

        try {
            r1.encher(15000);
        } catch (Exception e) {
            System.out.println("Erro apresentado:" + e.getMessage());
        }

        System.out.println("O total de reservatórios é: " + Reservatorio.getTotalReservatorios());

        System.out.println("Reservatório 1: " + r1.getNivelAtual());
        System.out.println("Reservatório 2: " + r2.getNivelAtual());
    }
}
