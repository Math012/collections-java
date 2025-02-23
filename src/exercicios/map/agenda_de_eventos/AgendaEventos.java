package exercicios.map.agenda_de_eventos;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    public static void AdicionarEvento(Map<LocalDate, Evento> eventos, LocalDate data, String nome, String atracao){
        eventos.put(data,new Evento(nome,atracao));
    }

    public static void exibirAgenda(Map<LocalDate, Evento> eventos){
        eventos = new TreeMap<>(eventos);
        System.out.println(eventos);
    }

    public static void obterProximoEvento(Map<LocalDate, Evento> eventos){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento>eventosOrdem = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> evento : eventosOrdem.entrySet()){
            if (evento.getKey().isEqual(dataAtual) || evento.getKey().isAfter(dataAtual)){
                System.out.println(evento.getKey() +", "+evento.getValue());
            }
        }
    }
}
