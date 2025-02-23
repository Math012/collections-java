package exercicios.list.ordenacao_de_numeros;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        OrdenacaoNumeros.adicionarNumero(numeros, 10);
        OrdenacaoNumeros.adicionarNumero(numeros, 20);
        OrdenacaoNumeros.adicionarNumero(numeros, 30);
        OrdenacaoNumeros.adicionarNumero(numeros, 40);
        OrdenacaoNumeros.adicionarNumero(numeros, 50);

        System.out.println("Ordenar forma Ascendente");
        OrdenacaoNumeros.ordenarAscendente(numeros);
        System.out.println("Ordenar forma Descendente");
        OrdenacaoNumeros.ordenarDescendente(numeros);
    }
}
