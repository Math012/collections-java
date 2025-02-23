package exercicios.set.lista_de_tarefa;

import java.util.Set;

public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa(){}

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + ", concluida: " + concluida  +"\n";

    }

    public void adicionarTarefa(Set<Tarefa> tarefas, String descricao){
        tarefas.add(new Tarefa(descricao,false));
    }

    public void removerTarefa(Set<Tarefa> tarefas,String descricao){
        for (Tarefa tarefa:tarefas){
            if (tarefa.getDescricao() == descricao){
                tarefas.remove(tarefa);
            }
        }
    }

    public void exibirTarefas(Set<Tarefa> tarefas){
        System.out.println(tarefas);
    }

    public void contarTarefas(Set<Tarefa> tarefas){
        System.out.println("Total de tarefas: " + tarefas.size());
    }

    public void obterTarefasConcluidas(Set<Tarefa> tarefas){
        for (Tarefa tarefa: tarefas){
            if (tarefa.isConcluida()){
                System.out.println(tarefas);
            }
            break;
        }
    }

    public void obterTarefasPendentes(Set<Tarefa> tarefas){
        for (Tarefa tarefa: tarefas){
            if (!tarefa.isConcluida()){
                System.out.println(tarefas);
            }
            break;
        }
    }

    public void marcarTarefaConcluida(Set<Tarefa> tarefas,String descricao){
        for (Tarefa tarefa: tarefas){
            if (tarefa.getDescricao() == descricao){
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(Set<Tarefa> tarefas,String descricao){
        for (Tarefa tarefa: tarefas){
            if (tarefa.getDescricao() == descricao){
                tarefa.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(Set<Tarefa> tarefas){
        tarefas.removeAll(tarefas);
    }
}
