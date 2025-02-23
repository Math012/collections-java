package exercicios.list.soma_de_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        SomaMethods.adicionarNumero(numeros,10);
        SomaMethods.adicionarNumero(numeros,15);
        SomaMethods.adicionarNumero(numeros,9);
        SomaMethods.adicionarNumero(numeros,20);
        SomaMethods.adicionarNumero(numeros,30);
        SomaMethods.adicionarNumero(numeros,45);

        System.out.println("Calcular soma");
        SomaMethods.calcularSoma(numeros);

        System.out.println("Encontrar maior número: [45]");
        SomaMethods.encontrarMaiorNumero(numeros);
        System.out.println("Encontrar menor número: [9]");
        SomaMethods.encontrarMenorNumero(numeros);
        System.out.println("Exibir números: [10,15,9,20,30,45]");
        SomaMethods.exibirNumeros(numeros);
    }




}
