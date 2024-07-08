package FunctionalInterface.Consumer.ExemploProfessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com uma classe anônima para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        };

        // Usar o Consumer para imprimir números pares da lista
        for (Integer numero : numeros) {
            imprimirNumeroPar.accept(numero);
        }
    }
}
