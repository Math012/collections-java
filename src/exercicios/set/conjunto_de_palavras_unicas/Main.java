package exercicios.set.conjunto_de_palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> palavras = new HashSet<>();


        ConjuntoPalavrasUnicas.adicionarPalavra(palavras, "Adoro programar");
        ConjuntoPalavrasUnicas.adicionarPalavra(palavras, "Adoro comer");
        ConjuntoPalavrasUnicas.adicionarPalavra(palavras, "Adoro dormir");
        ConjuntoPalavrasUnicas.adicionarPalavra(palavras, "Adoro viajar");

        System.out.println("Removendo palavra [Adoro comer]");
        ConjuntoPalavrasUnicas.removerPalavra(palavras, "Adoro comer");
        System.out.println();
        System.out.println("Verificando se a palavra existe: [Adoro viajar]");
        ConjuntoPalavrasUnicas.verificarPalavra(palavras, "Adoro viajar");
        System.out.println();
        System.out.println("Verificando se a palavra existe: [Adoro dormir]");
        ConjuntoPalavrasUnicas.verificarPalavra(palavras, "Adoro dormir");
        System.out.println();
        System.out.println("Exibindo palavras");
        ConjuntoPalavrasUnicas.exibirPalavrasUnicas(palavras);

    }
}
