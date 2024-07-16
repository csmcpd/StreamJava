package FunctionalInterface.Predicate.ExemploProfessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample2 {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra
        // lista
        List<Integer> numerosPares = numeros.stream()
                .filter(isPar)
                .collect(Collectors.toList());        

        // Imprimir a lista de números pares
        numerosPares.forEach(System.out::println);

        //Modo com lambda
        numeros.stream()
        .filter(p -> p % 2 == 0)
        .forEach(System.out::println);
    }
}
