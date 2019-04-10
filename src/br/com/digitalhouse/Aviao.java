package br.com.digitalhouse;

public class Aviao implements Voador {
    private String tipoDeAsa;
    private int qtdAssentos;

    public Aviao() {
    }

    public Aviao(int qtdAssentos, String tipoDeAsa) {
        qtdAssentos = qtdAssentos;
        tipoDeAsa = tipoDeAsa;
    }

    public String getTipoDeAsa() {
        return tipoDeAsa;
    }

    public void setTipoDeAsa(String tipoDeAsa) {
        this.tipoDeAsa = tipoDeAsa;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    @Override
    public void voar() {
        System.out.println("Voando como uma galinha...");

    }
}
