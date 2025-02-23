package exercicios.map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> palavras = new HashMap<>();
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra(palavras,"amor","emoção ou sentimento que leva uma pessoa a desejar o bem a outra pessoa ou a uma coisa");
        dicionario.adicionarPalavra(palavras,"felicidade","qualidade ou estado de feliz; estado de uma consciência plenamente satisfeita; satisfação, contentamento, bem-estar.");
        dicionario.adicionarPalavra(palavras,"tristeza","qualidade ou estado de triste; estado afetivo caracterizado pela falta de alegria, pela melancolia.");

        System.out.println("Removendo palavra [tristeza]");
        dicionario.removerPalavra(palavras,"amor");
        System.out.println();
        System.out.println("Exibindo a palavra [felicidade]");
        dicionario.exibirPalavras(palavras);
        System.out.println();
        System.out.println("Pesquisar por palavra [felicidade]");
        dicionario.pesquisarPorPalavra(palavras, "felicidade");
    }
}
