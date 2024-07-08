package FunctionalInterface.Consumer.ExemploProfessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println("Imprimindo números pares com consumer" + numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);

        teste(numeros);
    }

    public static void teste(List<Integer> numeros) {
        for (Integer integer : numeros) {
            if (integer % 2 == 0) {
                System.out.println("Imprimindo números pares sem consumer" + integer);
            }
        }
    }
}


