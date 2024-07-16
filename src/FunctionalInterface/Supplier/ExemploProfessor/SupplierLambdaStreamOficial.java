package FunctionalInterface.Supplier.ExemploProfessor;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um
 * resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado
 * tipo.
 */
public class SupplierLambdaStreamOficial {
    public static void main(String[] args) {
        /*
         * Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
         */
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        /*
         * Usar o Supplier para obter uma lista com 5 saudações
         * 
         * limit(5) - recebe um Long indicando quantas vezes terei determinado elemento
         * 
         * collect(Collectors.toList()) - recebe um coletor(pode ser um supplier tambem)
         * que vai
         * tranbsformar em um list. Mas tem outras opcoes
         * 
         * Resumindo - Vou criar a frase com o generate passando um supplier
         * vou informar quantas vezes quero a saudação com o limit
         * vou pegar todas as saudações geradas e colocar em um list com o collect
         */

        /*
         * Usar o Supplier para obter uma lista com 5 saudações
         */

        /* Forma completa com classe anônima */

        List<String> listaSaudacoes = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)!";
            }
        })
                .limit(5)
                .collect(Collectors.toList());

        /* Forma simplificada 1 */

        List<String> listaSaudacoes2 = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        /* Forma simplificada 2 */
        List<String> listaSaudacoes3 = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        /* Forma mais simplificada 3 */
        List<String> listaSaudacoes4 = Stream.generate(saudacao)
                .limit(5)
                .toList();

        /*
         * Imprimir as saudações geradas com consumer e lambda
         * sabendo que um consumer tem um argumento e um corpo
         */
        listaSaudacoes.forEach(n -> System.out.println(n));

        listaSaudacoes2.forEach(n -> System.out.println(n));

        listaSaudacoes3.forEach(n -> System.out.println(n));

        // Imprimir as saudações geradas com method reference
        listaSaudacoes.forEach(System.out::println);

        listaSaudacoes2.forEach(System.out::println);

        listaSaudacoes3.forEach(System.out::println);

        listaSaudacoes4.forEach(System.out::println);
    }
}
