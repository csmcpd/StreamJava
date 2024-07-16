package FunctionalInterface.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample3 {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o BinaryOperator com classe anônima para somar dois números inteiros
    BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
      @Override
      public Integer apply(Integer num1, Integer num2) {
        return num1 + num2;
      }
    };

    // Usar o BinaryOperator para somar todos os números no Stream
    int resultado = numeros.stream()
        .reduce(0, somar);

    // Imprimir o resultado da soma
    System.out.println("A soma dos números é: " + resultado);
  }
}
