package FunctionalInterface.Supplier.ExemploProfessor;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Supplier<T>:Representa uma operação que não aceita 
 * nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou 
 * fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample2 {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    /*
     * Usar o Supplier para obter uma lista com 5 saudações
     */
    List<String> listaSaudacoes = Stream.generate(new Supplier<String>() {
      @Override
      public String get() {
        return "Olá, seja bem-vindo(a)!";
      }
    })
        .limit(5)
        .collect(Collectors.toList());

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes3 = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());

    /*
     * Usar o Supplier para obter uma lista com 5 saudações
     * Forma mais simplificada 01
     */
    List<String> listaSaudacoes4 = Stream.generate(
      () -> "Olá, seja bem-vindo(a)!")
        .limit(5)
        .collect(Collectors.toList());

    /*
     * Usar o Supplier para obter uma lista com 5 saudações
     * Forma mais simplificada 02
     */
    List<String> listaSaudacoes2 = Stream.generate(saudacao)
        .limit(5)
        .toList();

    // Imprimir as saudações geradas com um forEach que utiliza um Consumer
    // que recebe um argumento, tem um corpo, e não retorna nada.
    listaSaudacoes.forEach(s -> System.out.println());

    /*
     * Imprimir as saudações geradas com method reference
     * 
     * Esta usando o System.out para imprimir cada elemento
     * da lista listaSaudacoes
     */
    listaSaudacoes.forEach(System.out::println);

    listaSaudacoes2.forEach(System.out::println);

    listaSaudacoes3.forEach(System.out::println);

    listaSaudacoes4.forEach(System.out::println);
  }
}
