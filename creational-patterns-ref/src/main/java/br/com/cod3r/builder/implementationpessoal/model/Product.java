package br.com.cod3r.builder.implementationpessoal.model;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final String description;
    private final String brand;
    private final String category;
    private final int avaliableAmount;
    private final BigDecimal price;

    private Product(String name, String description, String brand, String category, int avaliableAmount, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.category = category;
        this.avaliableAmount = avaliableAmount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public int getAvaliableAmount() {
        return avaliableAmount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static class Builder {
        private final String name;
        private String description;
        private String brand;
        private String category;
        private int avaliableAmount;
        private BigDecimal price;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder withAvaliableAmount(int avaliableAmount) {
            this.avaliableAmount = avaliableAmount;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(name, description, brand, category, avaliableAmount, price);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", avaliableAmount=" + avaliableAmount +
                ", price=" + price +
                '}';
    }
}
