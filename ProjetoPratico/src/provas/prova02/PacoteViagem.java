package provas.prova02;

import java.util.ArrayList;

public class PacoteViagem {

    private Cliente titular;
    private Localidade destino;
    private ArrayList<ServiceTuristico> servicos;

    public PacoteViagem(Cliente titular, String cidade, String pais) {
        setTitular(titular);
        destino = new Localidade(cidade, pais);
        this.servicos = new ArrayList<>();
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        if (titular == null) {
            throw new IllegalArgumentException("Titular obrigatório");
        }
        this.titular = titular;
    }

    public String getCidadeDestino() {
        return destino.getCidade();
    }

    public String getPaisDestino() {
        return destino.getPais();
    }

    public ArrayList<ServiceTuristico> getServicos() {
        return servicos;
    }

    public void adicionarServico(ServiceTuristico s) {
        if (s == null) {
            throw new IllegalArgumentException("Serviço inválido");
        }

        // Opção 1
        for (ServiceTuristico serviceTuristico : servicos) {
            if (s.getCodigo() == serviceTuristico.getCodigo()) {
                throw new IllegalStateException("Serviço já incluído no pacote");
            }
        }

        // Opção 2
        if (servicos.contains(s)) {
            throw new IllegalStateException("Serviço já incluído no pacote");
        }

        if (servicos.size() == 6) {
            throw new IllegalStateException("Pacote lotado");
        }

        servicos.add(s);
    }

    public void removerServico(ServiceTuristico s) {
        if (!servicos.remove(s)) {
            throw new IllegalStateException("Serviço não encontrado no pacote");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ServiceTuristico serviceTuristico : servicos) {
            total = total + serviceTuristico.calcularValor();
        }
        return total;
    }

    public double calcularTotalReembolsavel() {
        double totalReembolsavel = 0;
        for (ServiceTuristico serviceTuristico : servicos) {
            if (serviceTuristico instanceof Reembolsavel) {
                totalReembolsavel =  totalReembolsavel 
                + ((Reembolsavel) serviceTuristico).calcularReembolso();
            }
        }
        return totalReembolsavel;
    }
}
