package comparator;

import comparator.Livro;

import java.util.ArrayList;
import java.util.Collections;

/**
 *      QUANDO UTILIZAMOS O COMPARABLE, PRECISAMO UTILIZAR "Collections.sort(livros, new CompararAno());"
 *      NO CASO DE UMA LISTA, TEMOS QUE PASSAR A LISTA E A CLASSE QUE IMPLEMENTAMOS PARA ORDENAR OS DADOS
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<comparator.Livro> livros = new ArrayList<comparator.Livro>(){
            {
                add(new comparator.Livro("Aprendendo a programar em C#","Bejls", 2006));
               add( new comparator.Livro("Aprendendo a programar em C++","Joaue", 2001));
                add(new comparator.Livro("Aprendendo a programar em Java","Adam", 2006));
                add(new comparator.Livro("Aprendendo a programar em Cobol","Klow", 1990));
                add(new comparator.Livro("Aprendendo a programar em C","Tysw", 1982));
                add(new comparator.Livro("Aprendendo a programar em JS","Kole", 2012));
            }
        };
        System.out.println("Livros após ordenação por ano:  ");
        Collections.sort(livros, new CompararAno());
        for (Livro livro: livros){
            System.out.println("Titulo: " + livro.getTitulo()+", Autor: "+ livro.getAutor()+ ", Ano: " + livro.getAno());
        }

        System.out.println("-----------------------------------------");
        System.out.println("Livros após ordenação por autor:  ");
        Collections.sort(livros, new CompararAutor());
        for (Livro livro : livros){
            System.out.println("Titulo: " + livro.getTitulo()+", Autor: "+ livro.getAutor()+ ", Ano: " + livro.getAno());
        }
    }
}
