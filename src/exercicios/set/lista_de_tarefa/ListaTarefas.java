package exercicios.set.lista_de_tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    public static void main(String[] args) {
        Set<Tarefa> tarefas = new HashSet<>();
        Tarefa tarefa = new Tarefa();

        tarefa.adicionarTarefa(tarefas,"limpar a casa");
        tarefa.adicionarTarefa(tarefas,"estudar programação");
        tarefa.adicionarTarefa(tarefas,"fazer trabalho");
        tarefa.adicionarTarefa(tarefas,"assistir um filme");
        tarefa.adicionarTarefa(tarefas,"assistir uma serie");

        System.out.println("Remover uma tarefa com base na descrição: [assistir uma serie]");
        tarefa.removerTarefa(tarefas,"assistir uma serie");
        System.out.println();

        System.out.println("Exibindo todas as tarefas");
        tarefa.exibirTarefas(tarefas);
        System.out.println();

        System.out.println("Total de tarefas: [4]");
        tarefa.contarTarefas(tarefas);
        System.out.println();

        System.out.println("Tarefas concluídas");
        tarefa.obterTarefasConcluidas(tarefas);
        System.out.println();

        System.out.println("Tarefas pendentes");
        tarefa.obterTarefasPendentes(tarefas);
        System.out.println();


        tarefa.marcarTarefaConcluida(tarefas,"estudar programação");
        tarefa.marcarTarefaConcluida(tarefas,"fazer trabalho");
        tarefa.marcarTarefaConcluida(tarefas,"assistir um filme");
        tarefa.marcarTarefaConcluida(tarefas,"limpar a casa");
        System.out.println();

        System.out.println("Exibindo novamente as tarefas concluídas");
        tarefa.obterTarefasConcluidas(tarefas);
        System.out.println();

        tarefa.marcarTarefaPendente(tarefas, "limpar a casa");
        tarefa.marcarTarefaPendente(tarefas, "fazer trabalho");

        System.out.println("Exibindo novamente as tarefas pendentes");
        tarefa.obterTarefasPendentes(tarefas);
        System.out.println();

        System.out.println("Exibindo todas as tarefas novamente");
        tarefa.exibirTarefas(tarefas);
        System.out.println();

        System.out.println("Deletando todas as tarefas");
        tarefa.limparListaTarefas(tarefas);
        System.out.println();

        System.out.println("Lista de tarefas vazia");
        tarefa.exibirTarefas(tarefas);

    }
}
