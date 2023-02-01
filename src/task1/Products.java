package task1;

import java.util.Objects;

    //Напишите простое приложение для формирования списка продуктов.
    //  Требования к приложению:
    // - Все товары в списке должны быть уникальными. При попытке добавить уже имеющийся продукт необходимо выбросить исключение. Например, если в списке уже есть бананы, то второй раз добавить их нельзя.
    // - Каждому продукту помимо названия можно добавить две характеристики: цена и необходимое количество, которое указывается в килограммах.
    // - Если какой-то из параметров не заполнен, то программа должна выдавать ошибку и сообщение «Заполните карточку товара полностью».
    // - В список продуктов можно добавить новый товар, отметить, что он уже куплен, или удалить его из списка.
    //  - Названия всех продуктов должны быть на русском языке.

public class Products {
    private String productName;
    private double price;
    private double weight;

    public Products(String productName, double price, double weight) {
        if(productName!=null && !productName.isBlank() && !productName.isEmpty() && price>0 && weight>0 ) {
            this.productName = productName;
            this.price = price;
            this.weight = weight;
            addProductsToList(this);
        }else {
            throw new RuntimeException("Заполните карточку товара полностью" + productName + " !");
        }
    }

    private void addProductsToList(Products products) {
    }

    @Override
    public String toString() {
        return productName + "(цена" + price + "руб" + "за вес " + weight + "кг)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.price, price) == 0 && Double.compare(products.weight, weight) == 0 && Objects.equals(productName, products.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, weight);
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}


