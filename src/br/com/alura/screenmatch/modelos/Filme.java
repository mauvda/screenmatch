package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificacao;

public class Filme extends Titulo implements Classificacao{
    private String diretor;

    @Override
    public void exibeFcihaTecnica() {
        // TODO Auto-generated method stub
        System.out.println("Diretor: " + getDiretor());
        super.exibeFcihaTecnica();
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getMediaAvaliacao()/2;
    }

}
