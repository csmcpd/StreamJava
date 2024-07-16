package FunctionalInterface.Supplier.ExemploProfessor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample3 {
    public static void main(String[] args) {
        // Usar o Supplier com uma classe anônima para fornecer uma saudação
        // personalizada
        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)!";
            }
        };

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaSaudacoes.add(saudacao.get());
        }

        // Imprimir as saudações geradas
        for (String saudacaoGerada : listaSaudacoes) {
            System.out.println(saudacaoGerada);
        }
    }
}
