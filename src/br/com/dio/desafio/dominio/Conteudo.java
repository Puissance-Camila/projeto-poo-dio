package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String desccricao;

    public abstract double calcularXP;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesccricao() {
        return desccricao;
    }

    public void setDesccricao(String desccricao) {
        this.desccricao = desccricao;
    }

    public double getCalcularXP() {
        return calcularXP;
    }

    public void setCalcularXP(double calcularXP) {
        this.calcularXP = calcularXP;
    }
}
