package exercicios.list.pesquisa_de_livros;

import java.util.List;

public class Livro {

    private String titulo;
    private String autor;
    private int ano;

    public Livro(){}

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void adicionarLivro(List<Livro> livros, String titulo, String autor, int ano){
        livros.add(new Livro(titulo,autor,ano));
    }

    public void pesquisarPorAutor(List<Livro> livros, String autor){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getAutor() == autor){
                System.out.println(
                        "Titulo: "
                        + livros.get(i).getTitulo()
                        + ", Autor: "
                        + livros.get(i).getAutor()
                        + ", Ano: " + livros.get(i).getAno()
                );
            }
        }
    }

    public void pesquisarPorIntervaloAnos(List<Livro> livros, int anoInicial, int anoFinal){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getAno() >= anoInicial && livros.get(i).getAno() <= anoFinal){
                System.out.println(
                        "Titulo: "
                                + livros.get(i).getTitulo()
                                + ", Autor: "
                                + livros.get(i).getAutor()
                                + ", Ano: " + livros.get(i).getAno()
                );
            }
        }
    }

    public void pesquisarPorTitulo(List<Livro> livros, String titulo){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo() == titulo){
                System.out.println(
                        "Titulo: "
                                + livros.get(i).getTitulo()
                                + ", Autor: "
                                + livros.get(i).getAutor()
                                + ", Ano: " + livros.get(i).getAno()
                );
            }
        }
    }
}


