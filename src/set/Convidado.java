package set;

import java.util.Objects;
import java.util.Set;

/**
 *  Para que o set faça a verificação de elementos duplicados, precisamos implementar o
 *  equals e hashcode dentro da classe que estamos utilizando o Set<>
 */

public class Convidado {

    private String nome;
    private int codigo;

    public Convidado(){}

    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void adicionarConvidado(Set<Convidado> convidadoSet, String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(Set<Convidado> convidadoSet, int codigoConvite){
        for(Convidado convidado: convidadoSet){
            if (convidado.getCodigo() == codigoConvite){
                convidadoSet.remove(convidado);
                break;
            }
        }
    }

    public void contarConvidados(Set<Convidado> convidadoSet){
        System.out.println("Total de convidade: " + convidadoSet.size());
    }

    public void exibirConvidados(Set<Convidado> convidadoSet){
        System.out.println(convidadoSet);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigo() == convidado.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }
}
