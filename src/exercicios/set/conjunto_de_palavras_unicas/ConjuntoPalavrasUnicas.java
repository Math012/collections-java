package exercicios.set.conjunto_de_palavras_unicas;

import java.util.Set;

public class ConjuntoPalavrasUnicas {

    public static void adicionarPalavra(Set<String> palavras, String palavra){
        palavras.add(palavra);
    }

    public static void removerPalavra(Set<String> palavras,String findPalavra){
        for(String palavra:palavras){
            if (palavra.contains(findPalavra)){
                palavras.remove(palavra);
            }
        }
    }

    public static void verificarPalavra(Set<String> palavras, String findPalavra){
        for(String palavra:palavras){
            if (palavra.contains(findPalavra)){
                System.out.println("A palavra: " + palavra + " já esta presente no conjunto!");
                break;
            }
        }
    }

    public static void exibirPalavrasUnicas(Set<String> palavras){
        System.out.println(palavras);
    }
}
