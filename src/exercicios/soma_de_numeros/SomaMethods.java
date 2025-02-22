package exercicios.soma_de_numeros;

import java.util.List;

public class SomaMethods {

    public SomaMethods(){

    }

    public  static void adicionarNumero(List<Integer> numeros, int numero){
        numeros.add(numero);
    }

    public static void calcularSoma(List<Integer> numeros){
        int total = 0;
        for(Integer numero: numeros){
            total += numero;
        }
        System.out.println("Soma total: " + total);
    }

    public static void encontrarMaiorNumero(List<Integer> numeros){
        int maiorNumero = 0;

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) > maiorNumero){
                maiorNumero = numeros.get(i);
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
    }

    public static void encontrarMenorNumero(List<Integer> numeros){
        int menorNumero = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) < menorNumero){
                menorNumero = numeros.get(i);
            }
        }
        System.out.println("O menor número é: " + menorNumero);
    }

    public static void exibirNumeros(List<Integer> numeros){
        for (Integer numero:numeros){
            System.out.print(" [" + numero +"] ");
        }
    }
}


