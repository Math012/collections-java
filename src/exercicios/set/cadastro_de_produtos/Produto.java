package exercicios.set.cadastro_de_produtos;

import java.util.*;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Long cod;
    private Double preco;
    private Integer qtd;

    public Produto() {
    }

    public Produto(String nome, Long cod, Double preco, Integer qtd) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareTo(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "\nProduto: " + nome + ", cod: " + cod + ", preco: " + preco + ", qtd: " + qtd + "\n";
    }

    public void adicionarProduto(Set<Produto> produtos, long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, cod, preco, quantidade));
    }

    public void exibirProdutosPorNome(Set<Produto> produtos) {
       produtos = new TreeSet<>(produtos);
        System.out.println(produtos);
    }

    public void exibirProdutosPorPreco(Set<Produto> produtos) {
        Set<Produto> produtosPorPreco = new TreeSet<>(new OrdemPreco());
        produtosPorPreco.addAll(produtos);
        System.out.println(produtosPorPreco);
    }
}

class OrdemPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o2.getPreco(),o1.getPreco());
    }
}
