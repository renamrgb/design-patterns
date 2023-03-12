package br.com.cod3r.builder.implementationpessoal;

import br.com.cod3r.builder.implementationpessoal.model.Product;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product.Builder("Caderno")
                .withBrand("Panine")
                .build();

        Product p2 = new Product.Builder("Carrinho de controle remoto")
                .withCategory("Brinquedo")
                .withAvaliableAmount(2)
                .withPrice(BigDecimal.valueOf(100))
                .build();

        System.out.println(p1);
        System.out.println(p2);
    }
}