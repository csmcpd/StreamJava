package FunctionalInterface.Predicate.ExemploProfessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample3 {
    public static void main(String[] args) {
      // Criar uma lista de números inteiros
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  
      // Usar o Predicate com uma classe anônima para filtrar números pares
      Predicate<Integer> isPar = new Predicate<Integer>() {
        @Override
        public boolean test(Integer numero) {
          return numero % 2 == 0;
        }
      };
  
      // Usar o predicado para filtrar números pares e armazená-los em outra lista
      List<Integer> numerosPares = new ArrayList<>();
      for (Integer numero : numeros) {
        if (isPar.test(numero)) {
          numerosPares.add(numero);
        }
      }
  
      // Imprimir a lista de números pares
      for (Integer numeroPar : numerosPares) {
        System.out.println(numeroPar);
      }
    }
  }
