package exercicios.ordenacao_de_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {



    public static void adicionarNumero(List<Integer>numeros,int numero){
        numeros.add(numero);
    }

    public static void ordenarAscendente(List<Integer> numeros){
        Collections.sort(numeros);
        for (Integer numero : numeros){
            System.out.println(numero);
        }
    }

    public static void ordenarDescendente(List<Integer> numeros){
        numeros.sort(Collections.reverseOrder());
        for (Integer numero : numeros){
            System.out.println(numero);
        }
    }
}