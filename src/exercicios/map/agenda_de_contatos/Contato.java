package exercicios.map.agenda_de_contatos;

import java.util.Map;

public class Contato {

    private String nome;
    private Integer telefone;

    public Contato(){

    }

    public Contato(String nome, Integer telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public void adicionarContato(Map<String, Integer> contatos,String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(Map<String, Integer> contatos,String nome){
        contatos.remove(nome);
    }

    public void exibirContatos(Map<String, Integer> contatos){
        for(Map.Entry<String,Integer> contato:contatos.entrySet()){
            System.out.println(contato.getKey() + ": "+contato.getValue());
        }
    }

    public void pesquisarPorNome(Map<String, Integer> contatos, String  nome){
        System.out.println(contatos.get(nome));
    }




}
