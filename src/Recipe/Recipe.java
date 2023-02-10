package Recipe;

import task1.Product;

import java.util.*;
//Вам необходимо усложнить задание со списком продуктов из прошлого урока. Создайте класс рецептов, который содержит поля:

//  1. Множество продуктов.
      //  2. Суммарная стоимость всех продуктов у данного рецепта.
       // 3. Название рецепта.

      //  Создайте множество, в котором будут храниться все рецепты. Добавьте в него несколько рецептов.

       // Рецепты не могут иметь одинаковое название — при попытке добавить рецепт с уже занятыми названием необходимо выбросить исключение. Рецепты с разным названием, содержащие одинаковый список продуктов, считаются разными рецептами.

       // - Критерии проверки
       // - Создан класс рецептов.
        //- Создана коллекция, которая содержит в себе рецепты.
      //  - Класс рецептов должен быть неизменяемым (созданы только геттеры).
     //   - Методы переопределены.
      //  - Выбрасывается исключение при попытке добавить рецепт с названием, которое уже существует.
       // - Есть возможность добавить рецепты с разными названиями, но с одинаковым списком продуктов.

        public class Recipe{
        private final String nameOfRecipe;
        private final Map<Product, Integer> products= new HashMap<>();
            public String getNameOfRecipe;
            private int totalCostRecipe;

            public Recipe(String nameOfRecipe) {
                this.nameOfRecipe = nameOfRecipe;
                this.totalCostRecipe = 0;
                //recipe.add(this);
            }
            public void addProductInRecipe(Product product, int requiredQuantity){
                if(products.containsKey(product)){
                    throw new RuntimeException("Something wrong ");
                }
                products.put(product, requiredQuantity);
                totalCostRecipe = (int) (totalCostRecipe + product.getPrice() * requiredQuantity);

            }
            public int getCostForProduct(){
                int sum = 0;
                for(Product key: products.keySet()){
                    sum += products.get(key) * key.getPrice();
                }
                return sum;
            }

            @Override
            public String toString() {
                return "Recipe{" +
                        "nameOfRecipe='" + nameOfRecipe + '\'' +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Recipe recipe = (Recipe) o;
                return totalCostRecipe == recipe.totalCostRecipe && Objects.equals(nameOfRecipe, recipe.nameOfRecipe) && Objects.equals(products, recipe.products);
            }

            @Override
            public int hashCode() {
                return Objects.hash(nameOfRecipe, products, totalCostRecipe);
            }

            public String getNameOfRecipe() {
                return nameOfRecipe;
            }

            public String getGetNameOfRecipe() {
                return getNameOfRecipe;
            }

            public int getTotalCostRecipe() {
                return totalCostRecipe;
            }

           // public Set<Product> getProducts() {
                //return products;


            public Map<Product, Integer> getProducts() {
                return products;
            }
        }

