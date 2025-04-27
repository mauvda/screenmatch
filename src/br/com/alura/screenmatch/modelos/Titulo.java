package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFcihaTecnica(){
        System.out.println("Titulo: " + getNome());
        System.out.println("Lançado no ano de: " + getAnoDeLancamento());
        System.out.println("Tempo de duração: " + getDuracaoEmMinutos() + " minutos");
        System.out.println("Nota: " + getMediaAvaliacao() + "\nCom " + getTotalDeAvaliacoes() + " avaliações");
    }

    public void avalia(double nota){
        totalDeAvaliacoes++;
        somaDasAvaliacoes += nota;

    }

    public double getMediaAvaliacao(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
