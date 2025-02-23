package exercicios.set.agenda_de_contatos;

import java.util.Set;

public class Contato {

    private String nome;
    private Long numeroDeTelefone;


    public Contato() {
    }

    public Contato(String nome, Long numeroDeTelefone) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(Long numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public void adicionarContato(Set<Contato> contatos, String nome, Long numero){
        contatos.add(new Contato(nome, numero));

    }

    public void exibirContato(Set<Contato> contatos){
        System.out.println(contatos);
    }

    public void pesquisarPorNome(Set<Contato> contatos, String nome){
        for(Contato contato:contatos){
            if (contato.getNome() == nome){
                System.out.println(contato);
            }
        }
    }

    public void atualizarNumeroContato(Set<Contato> contatos, String nome, Long novoNumero){
        for (Contato contato:contatos){
            if (contato.getNome() == nome){
                contato.setNumeroDeTelefone(novoNumero);
            }
        }
    }

    @Override
    public String toString() {
        return "Contato: " + nome + ", numeroDeTelefone: " + numeroDeTelefone +"\n";
    }
}
