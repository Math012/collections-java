package exercicios.list.carrinho_de_compras;

import java.util.List;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(){}

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarItem(List<Item> items, String nome, double preco, int quantidade){
        items.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(List<Item> items, String nome){
        for (int i = 0; i < items.size() ; i++) {
            if (items.get(i).nome == nome){
                items.remove(i);
            }
        }
    }

    public double calcularValorTotal(List<Item> items){
        double total = 0;

        for (Item item: items){
            total += (item.quantidade * item.preco);
        }
        return total;
    }

    public void exibirItens(List<Item> items){
        for (Item item:items){
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade:  " + item.getQuantidade());
        }
    }
}
