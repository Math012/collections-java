package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  O COMPARABLE É IMPLEMENTADO DENTRO DA CLASSE QUE SERA ORDENADA.
 *  O COMPARABLE PRECISA DO Collections.sort(livros); POIS ELE FAZ A ORDENAÇÃO
 *  DE FORMA INTERNA
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<Livro>(){
            {
                add(new Livro("Aprendendo a programar em Java","Adam", 2006));
                add(new Livro("Aprendendo a programar em C#","Bejls", 2006));
                       add( new Livro("Aprendendo a programar em C++","Joaue", 2001));
                        add(new Livro("Aprendendo a programar em Cobol","Klow", 1990));
                        add(new Livro("Aprendendo a programar em C","Tysw", 1982));
                        add(new Livro("Aprendendo a programar em JS","Kole", 2012));
            }
        };

        System.out.println("Livros após a ordenação natural (Ano): ");

        Collections.sort(livros);

        for (Livro livro:livros){
            System.out.println("Titulo: " + livro.getTitulo() + ", Author: " + livro.getAutor() + ", Ano: " + livro.getAno());
        }

    }
}
