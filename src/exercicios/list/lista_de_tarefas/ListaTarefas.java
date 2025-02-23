package exercicios.list.lista_de_tarefas;

/**
 * 1. Lista de Tarefas
 * Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo.
 * Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo
 * de descrição. Implemente os seguintes métodos:
 *
 * adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
 * removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
 * obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
 * obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
 */


import java.util.ArrayList;

public class ListaTarefas {
    public static void main(String[] args) {
        Tarefa tarefaMethods = new Tarefa();
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        System.out.println("===========ADICIONANDO TAREFA===========");
        tarefaMethods.adicionarTarefa(tarefas,"Tarefa número 1");
        tarefaMethods.adicionarTarefa(tarefas,"Tarefa número 2");
        tarefaMethods.adicionarTarefa(tarefas,"Tarefa número 3");
        tarefaMethods.adicionarTarefa(tarefas,"Tarefa número 4");
        tarefaMethods.adicionarTarefa(tarefas,"Tarefa número 5");
        tarefaMethods.adicionarTarefa(tarefas,"Tarefa número 6");

        System.out.println("===========REMOVENDO TAREFA 3/5/1===========");
        tarefaMethods.removerTarefa(tarefas,"Tarefa número 1");
        tarefaMethods.removerTarefa(tarefas,"Tarefa número 5");
        tarefaMethods.removerTarefa(tarefas,"Tarefa número 3");


        System.out.println("===========TAMANHO TOTAL DA LISTA===========");
        System.out.println(tarefaMethods.obterNumeroTotalTarefas(tarefas));

        System.out.println("===========LISTA COMPLETA===========");
        tarefaMethods.obterDescricoesTarefas(tarefas);

    }
}
