package exercicios.lista_de_tarefas;

import java.util.ArrayList;
import java.util.List;


public class Tarefa {

    private String description;

    public Tarefa(){}

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void adicionarTarefa(ArrayList<Tarefa> tarefas, String description){
        tarefas.add(new Tarefa(description));
    }

    public void removerTarefa(ArrayList<Tarefa> tarefas, String description){
        for(int i = 0; i < tarefas.size(); i++){
            if (tarefas.get(i).getDescription() == description){
                tarefas.remove(i);
            }
        }
    }

    public int obterNumeroTotalTarefas(ArrayList<Tarefa> tarefas){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(List<Tarefa> tarefas){
        for (Tarefa tarefa: tarefas){
            System.out.println("Descrição: " + tarefa.getDescription());
        }
    }
}
