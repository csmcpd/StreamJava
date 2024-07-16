package FunctionalInterface.Consumer.ExemploProfessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println("Imprimindo números pares com consumer ---" + numero + "\n");
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);

        /*---------- Outra forma 01 ------------*/

        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println("Imprimindo números pares sem consumer forma 01 --- " + n + "\n");
                }
            }
        });
        /* Outra forma 01 final */

        /* Utilizando função Lambda forma 01 - inicio */

        numeros.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println("Imprimindo números pares sem consumer forma 01 --- " + n + "\n");
            }
        });

        /* Utilizando função Lambda forma 01 - final */

        /* Utilizando função Lambda forma 02 mais fimplificada (Tirando stream()) - inicio */

        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println("Imprimindo números pares sem consumer forma 01 --- " + n + "\n");
            }
        });

        /* Utilizando função Lambda forma 01 mais fimplificada (Tirando stream())  - final */

        /* Anotação do aluno 01 - inicio */
        teste(numeros);
        /* Anotação do aluno 01 - final */
    }

    /*---------- Anotação do aluno 01 ------------*/

    public static void teste(List<Integer> numeros) {
        for (Integer integer : numeros) {
            if (integer % 2 == 0) {
                System.out.println("Imprimindo números pares sem consumer, Anotação do aluno 01 --- " + integer + "\n");
            }
        }
    }
}
