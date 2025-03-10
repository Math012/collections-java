package exercicios.map.agenda_de_eventos;

public class Evento {

    private String nomeEvento;
    private String nomeAtracao;

    public Evento(){}

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public void setNomeAtracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
    }

    @Override
    public String toString() {
        return "\nEvento: "+ nomeEvento + ", nomeAtracao: " + nomeAtracao + '\n';
    }
}
