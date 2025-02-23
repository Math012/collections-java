package exercicios.list.pesquisa_de_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        Livro livroMethods = new Livro();

        livros.add(new Livro("HTML E CSS","Adams",2001));
        livros.add(new Livro("Desenvolvimento Android","Kyle",2007));
        livros.add(new Livro("Como desenhar","Josh",2003));
        livros.add(new Livro("Aprendendo c++","Vincent",2008));
        livros.add(new Livro("Segredo do C","Lee",2010));
        livros.add(new Livro("Princípios do Cobol","Giuseppe",1987));
        livros.add(new Livro("Cyber Segurança","Caire",1996));
        livros.add(new Livro("Segurança em TI","Care",1999));
        livros.add(new Livro("Interface de usuário","Lisa",1994));
        livros.add(new Livro("Internet das coisas","Giuseppe",1985));
        livros.add(new Livro("Tudo sobre a internet","Becker",2011));
        livros.add(new Livro("Aprendendo Spring Boot","Giuseppe",2024));

        System.out.println("======= pesquisando por autor [Giuseppe] =======");
        livroMethods.pesquisarPorAutor(livros,"Giuseppe");
        System.out.println("--------------------------------------------------");
        System.out.println("======= pesquisando por ano [2000 - 2010] =======");
        livroMethods.pesquisarPorIntervaloAnos(livros,2000,2010);
        System.out.println("--------------------------------------------------");
        System.out.println("======= pesquisando por ano [1980 - 1999] =======");
        livroMethods.pesquisarPorIntervaloAnos(livros,1980,1999);
        System.out.println("--------------------------------------------------");
        System.out.println("======= pesquisando por titulo [Aprendendo Spring Boot] =======");
        livroMethods.pesquisarPorTitulo(livros, "Aprendendo Spring Boot");

    }
}
