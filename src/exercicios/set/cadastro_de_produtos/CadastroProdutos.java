package exercicios.set.cadastro_de_produtos;

import java.util.HashSet;
import java.util.Set;

public class CadastroProdutos {
    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();
        Produto produto = new Produto();

        produto.adicionarProduto(produtos,2132L,"Notebook",9500.00,1);
        produto.adicionarProduto(produtos,2132L,"Ovo",4.500,2);
        produto.adicionarProduto(produtos,2132L,"Mouse",6500.00,3);
        produto.adicionarProduto(produtos,2132L,"Teclado",250.00,2);

        System.out.println("Ordem alfabética");
        produto.exibirProdutosPorNome(produtos);
        System.out.println();

        System.out.println("Ordem de preços");
        produto.exibirProdutosPorPreco(produtos);
        System.out.println();

    }
}
