package exercicios.map.agenda_de_contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    public static void main(String[] args) {
        Map<String, Integer> contatos = new HashMap<>();
        Contato contato = new Contato();

        contato.adicionarContato(contatos,"math",2131223123);
        contato.adicionarContato(contatos,"Patricia",2131223123);
        contato.adicionarContato(contatos,"Juliana",2131223123);
        contato.adicionarContato(contatos,"Roberto",2131223123);

        System.out.println("Removendo o contato: [math]");
        contato.removerContato(contatos,"math");
        System.out.println();
        System.out.println("Exibindo todos os contatos: ");
        contato.exibirContatos(contatos);
        System.out.println();
        System.out.println("Pesquisando contato pelo nome [Roberto]");
        contato.pesquisarPorNome(contatos,"Roberto");
    }
}
