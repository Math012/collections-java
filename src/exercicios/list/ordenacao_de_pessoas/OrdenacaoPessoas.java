package exercicios.list.ordenacao_de_pessoas;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa = new Pessoa();
        pessoa.adicionarPessoa(pessoas, "Matheus",10,1.74);
        pessoa.adicionarPessoa(pessoas, "Ana",15,1.56);
        pessoa.adicionarPessoa(pessoas, "Josias",67,1.80);
        pessoa.adicionarPessoa(pessoas, "Andre",25,1.68);
        pessoa.adicionarPessoa(pessoas, "Renato",26,1.98);
        pessoa.adicionarPessoa(pessoas, "Maria",19,1.72);
        System.out.println("Ordenar por idade: ");
        pessoa.ordenarPorIdade(pessoas);
        System.out.println("Ordenar por altura: ");
        pessoa.ordenarPorAltura(pessoas);
    }



}
