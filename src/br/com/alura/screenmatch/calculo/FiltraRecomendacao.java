package br.com.alura.screenmatch.calculo;

public class FiltraRecomendacao {

    public void filtra(Classificacao c){
        if (c.getClassificacao() >= 4) {
            System.out.println("Esta entre os preferidos");
        } else if (c.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Adicione em sua lista");
        }
    }
}
