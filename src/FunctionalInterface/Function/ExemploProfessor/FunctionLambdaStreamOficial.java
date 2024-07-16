package FunctionalInterface.Function.ExemploProfessor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um
 * resultado do tipo R.
 * 
 * É utilizada para transformar, ou mapear os elementos do Stream em outros
 * valores, ou tipos.
 * Para fazer isso utilizamos o map.
 */

public class FunctionLambdaStreamOficial {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*
         * Usar a Function com expressão lambda para dobrar todos os números
         * Para usar a function utilizamos o tipo da entrada e o tipo da saída
         * Caso fosse transformar um Integer em String, faria da seguinte forma:
         * Function<Integer, String> variavel = ;
         */

        /* Function com expressões lambda */
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        /*
         * Usar a função para dobrar todos os números no Stream e armazená-los em outra
         * lista
         * O map vai mapear um valor para o outro
         * O map recebe uma function
         */

        /* Forma completa com classe anônima */
        List<Integer> numerosDobradosCompleto = numeros.stream()
                .map(new Function<Integer, Integer>() {

                    @Override
                    public Integer apply(Integer n) {
                        return n * 2;
                    }

                })
                .toList();

        /* Forma simplificada 1 - Usando lambda*/
        List<Integer> numerosDobradosMenosCodigo = numeros.stream()
                .map(n -> n * 2)
                .toList();

        /* Forma simplificada 2 */
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        /* Forma simplificada 3 */
        List<Integer> numerosDobrados2 = numeros.stream()
                .map(dobrar)
                .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));

        numerosDobrados2.forEach(n -> System.out.println(n));

        numerosDobradosCompleto.forEach(System.out::println);

        numerosDobradosMenosCodigo.forEach(System.out::println);

    }
}
