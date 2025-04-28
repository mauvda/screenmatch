import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import br.com.alura.screenmatch.calculo.Calculadora;
import br.com.alura.screenmatch.calculo.FiltraRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class App {
    public static void main(String[] args) throws Exception {
        Filme titulo1 = new Filme("Avatar", "Spilber", 2023, 200);
        Filme titulo2 = new Filme("Deadpool", "Kevin", 2020, 120);
        Serie titulo3 = new Serie("Game of Thrones", 6, 20, 50, 2010);
        Calculadora calculadora = new Calculadora();

        titulo1.avalia(8);
        titulo1.avalia(9);
        titulo1.exibeFcihaTecnica();
        titulo1.getMediaAvaliacao();
        System.out.println("");
        titulo2.avalia(6);
        titulo2.avalia(9);
        titulo2.exibeFcihaTecnica();
        titulo2.getMediaAvaliacao();
        System.out.println("");
        titulo3.avalia(6);
        titulo3.avalia(9);
        titulo3.avalia(5);
        titulo3.exibeFcihaTecnica();
        titulo3.getMediaAvaliacao();
        System.out.println("");

        calculadora.inclui(titulo1);
        calculadora.inclui(titulo2);
        calculadora.inclui(titulo3);

        System.out.println("O tempo total da sua lista é de " + calculadora.getTempoTotal() + " minutos");

        FiltraRecomendacao filtro = new FiltraRecomendacao();
        filtro.filtra(titulo2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(titulo3);
        episodio.setTotalVisualizacoes(200);
        filtro.filtra(episodio);

        ArrayList <Titulo> listaFilmes = new ArrayList<>();
        //Filme[] listaFilmes = new Filme[10]; \\ Lista criada com tamanho fixo
        listaFilmes.add(titulo1);
        listaFilmes.add(titulo2);
        listaFilmes.add(titulo3);
        System.out.println("Você tem " + listaFilmes.size() + " Filmes");
        // for (int i = 0; i < listaFilmes.size(); i++) {
        //     System.out.println(i+1 + ") " + listaFilmes.get(i).toString());
        // }
        Collections.sort(listaFilmes);
        for (Titulo i:listaFilmes){
            System.out.println(i);
            if (i instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

    }
}
