package exercicios.ordenacao_de_pessoas;

import comparable.Livro;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(){}

    public Pessoa(String nome, int idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void adicionarPessoa(List<Pessoa> pessoas, String nome, int idade, Double altura){
        pessoas.add(new Pessoa(nome,idade,altura));
    }

    public void ordenarPorIdade(List<Pessoa> pessoas){
        Collections.sort(pessoas);
        System.out.println("Ordenando por idade: ");
        for(Pessoa pessoa:pessoas){
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Altura: " + pessoa.getAltura());
        }
    }

    public void ordenarPorAltura(List<Pessoa> pessoas){
        Collections.sort(pessoas, new CompararAltura());
        for(Pessoa pessoa: pessoas){
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Altura: " + pessoa.getAltura());
        }
    }

    @Override
    public int compareTo(Pessoa o) {
        return idade.compareTo(o.idade);
    }
}

class CompararAltura implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getAltura().compareTo(o2.getAltura());
    }
}