package exemplos.unidade01.construtores;

public class Carro {

    private String cor;
    private String modelo;
    private int ano;
    private int renavam;
    private boolean documentoEmDia;


    public Carro() {
        documentoEmDia = true;
    }

    public Carro(String cor, String modelo, int ano, int renavam) {
        this();
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.renavam = renavam;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public boolean isDocumentoEmDia() {
        return documentoEmDia;
    }

    public void setDocumentoEmDia(boolean documentoEmDia) {
        this.documentoEmDia = documentoEmDia;
    }

    

    


}
