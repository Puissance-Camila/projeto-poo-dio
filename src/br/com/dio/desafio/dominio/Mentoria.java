package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

      public Mentoria() {
    }

    private LocalDate data;

    @Override
    public double calcularXP(){
        return 0;
    }
}




    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDesccricao() + '\'' +
                ", LocalDate=" + LocalDate +
                '}';
    }
