package FunctionalInterface.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
 * BinaryOperator<T>: Representa uma operação que 
 * combina dois argumentos do tipo T (Do mesmo tipo) e retorna um 
 * resultado do mesmo tipo T. É usada para realizar 
 * operações de redução em pares de elementos, 
 * como somar números ou combinar objetos.
 */
public class BinaryOperatorStreamLambdaOficial {
    public static void main(String[] args) {
        /* Criar uma lista de números inteiros */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*
         * Usar o BinaryOperator com expressão lambda
         * para somar dois números inteiros
         * 
         * BinaryOperator<Integer> - Só precisa colocar um tipo
         * pois os dois argumentos são de mesmo tipo
         * 
         * reduce - método do stream que utilizamos para implementar o BinaryOperator
         * 
         * O identity:0 do reduce é a variável temporária equivalente a variável do laço
         * for
         * O outro elemento do reduce é um BinaryOperator
         */
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        /*
         * Usar o BinaryOperator para somar todos os números no Stream.
         */

        int resultadoCompleto = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {

                    @Override
                    public Integer apply(Integer t, Integer u) {
                        return t + u;
                    }

                });

        int resultadoSimplificado = numeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        int resultadoSimplificadoMethodReference = numeros.stream()
                .reduce(0, Integer::sum);

        int resultado = numeros.stream()
                .reduce(0, somar);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);

        System.out.println(resultadoCompleto);

        System.out.println(resultadoSimplificado);

        System.out.println(resultadoSimplificadoMethodReference);

    }
}
