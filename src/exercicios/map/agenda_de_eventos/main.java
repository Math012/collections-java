package exercicios.map.agenda_de_eventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<LocalDate, Evento> eventos = new HashMap<>();
        AgendaEventos.AdicionarEvento(eventos,LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        AgendaEventos.AdicionarEvento(eventos,LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        AgendaEventos.AdicionarEvento(eventos,LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        AgendaEventos.AdicionarEvento(eventos,LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        AgendaEventos.AdicionarEvento(eventos,LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        System.out.println("Exibindo os eventos");
        AgendaEventos.exibirAgenda(eventos);
        System.out.println();
        System.out.println("Exibindo o próximo evento");
        AgendaEventos.obterProximoEvento(eventos);



    }
}
