package exercicios.set.lista_de_alunos;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
    public static void main(String[] args) {
        Set<Aluno> alunos = new HashSet<>();
        Aluno aluno = new Aluno();

        aluno.adicionarAluno(alunos,"math",123123L,9.8);
        aluno.adicionarAluno(alunos,"malu",123123L,8.5);
        aluno.adicionarAluno(alunos,"ju",123833L,6.00);
        aluno.adicionarAluno(alunos,"paty",193123L,10.00);
        aluno.adicionarAluno(alunos,"gi",128473L,7.0);

        System.out.println("Alunos em ordem alfabética");
        aluno.exibirAlunosPorNome(alunos);
        System.out.println();

        System.out.println("Removendo aluno: [paty]");
        aluno.removerAluno(alunos,193123);
        System.out.println();

        System.out.println("Aluno em ordem crescente de nota");
        aluno.exibirAlunosPorNota(alunos);
        System.out.println();

        System.out.println("Todos os alunos");
        aluno.exibirAlunos(alunos);
    }
}
