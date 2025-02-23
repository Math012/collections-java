package exercicios.map.dicionario;

import java.util.Map;

public class Dicionario {

    private String palavra;
    private String definicao;

    public Dicionario(){}

    public Dicionario(String palavra, String definicao) {
        this.palavra = palavra;
        this.definicao = definicao;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }

    public void adicionarPalavra(Map<String, String> palavras,String palavra, String definicao){
            palavras.put(palavra,definicao);
    }

    public void removerPalavra(Map<String, String> palavras,String palavra){
        palavras.remove(palavra);
    }

    public void exibirPalavras(Map<String, String> palavras){
        System.out.println(palavras);
    }

    public void pesquisarPorPalavra(Map<String, String> palavras,String palavra){
        System.out.println(palavras.get(palavra));
    }

    @Override
    public String toString() {
        return "\npalavra: " + palavra  + ", definicao: " + definicao + "\n";
    }
}
