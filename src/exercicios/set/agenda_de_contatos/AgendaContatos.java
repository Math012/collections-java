package exercicios.set.agenda_de_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Set<Contato> contatos = new HashSet<>();

        contato.adicionarContato(contatos,"math", 119998302982L);
        contato.adicionarContato(contatos,"ana", 11963748982L);
        contato.adicionarContato(contatos,"malu", 11998372982L);
        contato.adicionarContato(contatos,"ju", 11983875982L);
        contato.adicionarContato(contatos,"ju", 11983878382L);
        contato.adicionarContato(contatos,"ju", 192837875982L);

        System.out.println("Exibindo os contatos antes do update: ");
        contato.exibirContato(contatos);

        System.out.println();
        System.out.println("Pesquisando o contato pelo nome [ju]");
        contato.pesquisarPorNome(contatos,"ju");

        System.out.println();
        System.out.println("Atualizando o número do contato [malu] novo número [11983878382]");
        contato.atualizarNumeroContato(contatos,"malu", 11983878382L);

        System.out.println();
        System.out.println("Exibindo os contatos depois do update: ");
        contato.exibirContato(contatos);
    }
}
