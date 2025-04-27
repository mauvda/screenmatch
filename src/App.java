import java.util.ArrayList;

import br.com.alura.screenmatch.calculo.Calculadora;
import br.com.alura.screenmatch.calculo.FiltraRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Filme titulo1 = new Filme();
        Filme titulo2 = new Filme();
        Serie titulo3 = new Serie();
        Calculadora calculadora = new Calculadora();

        titulo1.setNome("Avatar");
        titulo1.setDiretor("Spilber");
        titulo1.setDuracaoEmMinutos(200);
        titulo1.setAnoDeLancamento(2023);
        titulo1.avalia(8);
        titulo1.avalia(9);
        titulo1.exibeFcihaTecnica();
        titulo1.getMediaAvaliacao();
        System.out.println("");

        titulo2.setNome("Deadpool");
        titulo2.setDiretor("Kevin");
        titulo2.setDuracaoEmMinutos(120);
        titulo2.setAnoDeLancamento(2020);
        titulo2.avalia(6);
        titulo2.avalia(9);
        titulo2.exibeFcihaTecnica();
        titulo2.getMediaAvaliacao();
        System.out.println("");

        titulo3.setNome("Game of Thrones");
        titulo3.setTemporadas(6);
        titulo3.setEpisodiosPorTemporada(20);
        titulo3.setMinutosPorEpisodio(50);
        titulo3.setAnoDeLancamento(2010);
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

        ArrayList <Filme> listaFilmes = new ArrayList<>();
        //Filme[] listaFilmes = new Filme[10]; \\ Lista criada com tamanho fixo
        listaFilmes.add(titulo1);
        listaFilmes.add(titulo2);
        System.out.println("Você tem " + listaFilmes.size() + " Filmes");
        for (int i = 0; i < listaFilmes.size(); i++) {
            System.out.println(i+1 + ") " + listaFilmes.get(i).getNome());
        }

    }
}
