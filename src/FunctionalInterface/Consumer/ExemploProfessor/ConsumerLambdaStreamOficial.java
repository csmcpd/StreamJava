package FunctionalInterface.Consumer.ExemploProfessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Consumer<T>: Representa uma operação que aceita 
 * um argumento do tipo T e não retorna nenhum resultado. 
 * É utilizada principalmente para realizar ações ou 
 * efeitos colaterais nos elementos do Stream 
 * sem modificar ou retornar um valor.
 */

public class ConsumerLambdaStreamOficial {
    public static void main(String[] args) {
        /* Criar uma lista de números inteiros */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /* Usar o Consumer com expressão lambda para imprimir numeros pares */
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        /* Usar o Consumer para imprimir números pares da lista */

        /* 1º forma */
        System.out.println("\n Imprimindo com Consumer forma 1 \n");

        for (Integer numero : numeros) {
            imprimirNumeroPar.accept(numero);
        }

        /* 2º forma */
        System.out.println("\n Imprimindo com Consumer forma 2 \n");

        /*
         * Transforma a lista de números em um stream, para que,
         * o consumer consiga percorrer por cada um dos elementos
         * da lista de números
         */
        numeros.stream().forEach(imprimirNumeroPar);

        /* Usando method reference para imprimir todos os números(PAres e ímpares) */
        System.out.println("\n Imprimindo todos os números com method reference \n");

        numeros.stream().forEach(System.out::println);

        /* -------------------------- Bizu ---------------------------- */

        /* Pulo do gato inicio */

        /* Consumer */
        numeros.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println("\n imprimindo números pares no bizu forma 1 \n" + n);
                }
            }

        });

        /* Lambda 1 - Consumer com Lambda de forma simples */
        numeros.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println("\n imprimindo números pares no bizu forma 2 \n" + n);
            }
        });

        /*
         * Lambda 2 - Consumer com Lambda de forma simples e sem precisar colocar o
         * stream
         */
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println("\n imprimindo números pares no bizu forma 3 \n" + n);
            }
        });

        /* Pulo do gato final */

        /* Usando o predicate com a consumer para obter números pares*/
        System.out.println("\n Imprimindo números pares com predicate e consumer");
        numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(n -> System.out.println(n));
    }
}
