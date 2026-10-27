package provas.prova02;

public class Principal {

    public static void main(String[] args) {
        Cliente c = new Cliente("André", "123456");
        PacoteViagem p = new PacoteViagem(c, "Gramado", "Brasil");

        p.adicionarServico(new Hospedagem("Hotel Serra", 300, 3));
        p.adicionarServico(new Passeio("Tour das vinícolas", 120, 5));
        p.adicionarServico(new Passeio("Snowland", 200, 2));

        for (ServiceTuristico servico : p.getServicos()) {
            System.out.println(servico);
        }

        System.out.println("Cidade destino: " + p.getCidadeDestino());
        System.out.println("Titular: " + p.getTitular().getNome());
        System.out.println("Valor total: " + p.calcularValorTotal());
        System.out.println("Total reembolsavel: " + p.calcularTotalReembolsavel());

        try {
            new PacoteViagem(null, "Blumenau", "Brasil");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }

}
