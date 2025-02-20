package comparator;

import java.util.Comparator;

public class Livro {

    private String titulo;
    private String autor;
    private Integer ano;

    public Livro(String titulo, String autor, Integer ano) {
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}

class CompararAutor implements Comparator<Livro>{
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}

class CompararAno implements Comparator<Livro>{

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getAno().compareTo(o2.getAno());
    }
}