package exercicios.set.lista_de_alunos;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(){}

    public Aluno(String nome, Long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareTo(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public double getnota() {
        return nota;
    }

    public void setnota(double nota) {
        this.nota = nota;
    }

    public void adicionarAluno(Set<Aluno> alunos, String nome, Long matricula, double nota){
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(Set<Aluno> alunos,long matriculaAluno){
        for (Aluno aluno: alunos)
            if (aluno.getMatricula() == matriculaAluno){
                alunos.remove(aluno);
                break;
            }
    }

    public void exibirAlunosPorNome(Set<Aluno> alunos){
        alunos = new TreeSet<>(alunos);
        System.out.println(alunos);
    }
    public void exibirAlunosPorNota(Set<Aluno> alunos){
        Set<Aluno> alunosNota = new TreeSet<>(new compararPorNota());
        alunosNota.addAll(alunos);
        System.out.println(alunosNota);
        
    }
    public void exibirAlunos(Set<Aluno> alunos){
        System.out.println(alunos);
    }

    @Override
    public String toString() {
        return "\nAluno: "  + nome + ", matricula: " + matricula + ", nota: " + nota+"\n";
    }
}



class compararPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o2.getnota(),o1.getnota());
    }
}
