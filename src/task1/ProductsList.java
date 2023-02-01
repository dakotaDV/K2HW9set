package task1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

    public class ProductsList {
        public static Set<Products> ProductsList = new HashSet<>();

        public static void printListOfProduct() {
            System.out.println("*** Список продуктов: ");

            for (Products products : ProductsList) {
                System.out.println(products.getProductName() + "- " + products.getPrice() + " руб " + products.getWeight() + "кг.");
            }
        }

        protected static void addProductToList(Products newProduct) {
            if (!ProductsList.add(newProduct)) {
                throw new RuntimeException("Такой продукт уже есть!");
            }
        }
        public static boolean removeProductOnList(String productNameToRemove) {
            for (int i = 0; i < ProductsList.size(); i++) {
                if (ProductsList.get(i).getProductName().equals(productNameToRemove)) {
                    ProductsList.remove(i);
                    System.out.println(productNameToRemove + "удален из множества!");
                    return true;
                }
                System.out.println("Продукт " + productNameToRemove + " не найден в множистве! ");
                return false;
            }
        }


        public static boolean checkProductInList(String productNameToCheck) {
            for (Products product : ProductsList) {
                if (product.getProductName().equals(productNameToCheck)) {
                    System.out.println(productNameToCheck + " уже куплен!");
                    return false;
                }
            }

            System.out.println(productNameToCheck + "еще не куплен!");
            return false;

        }
    }
