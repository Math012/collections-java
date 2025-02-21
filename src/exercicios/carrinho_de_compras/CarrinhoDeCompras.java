package exercicios.carrinho_de_compras;

/**
 * 2. Carrinho de Compras:
 * Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online.
 * O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma
 * classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os
 * seguintes métodos:
 *
 * adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com
 * o nome, preço e quantidade especificados.
 *
 * removerItem(String nome): Remove um item do carrinho com base no seu nome.
 *
 * calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço
 * e a quantidade de cada item.
 *
 * exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
 */


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Item itemMethods = new Item();
        List<Item> items = new ArrayList<>();

        System.out.println("####### adicionando items #######");

        itemMethods.adicionarItem(items,"Tv",2250.00,1);
        itemMethods.adicionarItem(items,"Alexa",250.00,1);
        itemMethods.adicionarItem(items,"Monitor",150.00,2);
        itemMethods.adicionarItem(items,"Gabinete",90.00,1);
        itemMethods.adicionarItem(items,"Placa de vídeo",4500.00,1);
        itemMethods.adicionarItem(items,"Mouse",250.00,3);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("####### removendo items [Mouse, Alexa] #######");
        itemMethods.removerItem(items,"Alexa");
        itemMethods.removerItem(items,"Mouse");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("####### calculando valor total dos items [7.140] #######");
        System.out.println("Valor total: " + itemMethods.calcularValorTotal(items));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("####### exibindo items #######");
        itemMethods.exibirItens(items);


    }





}
