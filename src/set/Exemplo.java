package set;

import java.util.HashSet;
import java.util.Set;

/**
 * Enunciado
 *
 * . Conjunto de Convidados
 * Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo
 * "Convidado" como atributo. Cada convidado possui atributos como nome e código do
 * convite. Implemente os seguintes métodos:
 *
 * adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
 *
 * removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do
 * conjunto com base no código do convite.
 *
 * contarConvidados(): Conta o número total de convidados no Set.
 *
 * exibirConvidados(): Exibe todos os convidados do conjunto.
 */

public class Exemplo {
    public static void main(String[] args) {

        Set<Convidado> convidados = new HashSet<>();
        Convidado convidado = new Convidado();

        convidado.adicionarConvidado(convidados,"Math", 213123);
        convidado.adicionarConvidado(convidados,"Maria", 123124);
        convidado.adicionarConvidado(convidados,"Andre", 1254541);
        convidado.adicionarConvidado(convidados,"Josias", 1231223);

        System.out.println("Removendo convidado por código [Josias, 1231223]");
        convidado.removerConvidadoPorCodigoConvite(convidados, 1231223);
        System.out.println("Total de convidado: [3]");
        convidado.contarConvidados(convidados);
        System.out.println("Exibindo convidados");
        convidado.exibirConvidados(convidados);

    }
}
