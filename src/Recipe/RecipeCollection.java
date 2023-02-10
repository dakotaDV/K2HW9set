package Recipe;

import java.util.HashSet;
import java.util.Set;

public class RecipeCollection {
    public static Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Recipe recipe) {
        for (var RecipeInCollection : recipes) {
            if (RecipeInCollection.getNameOfRecipe().equals(recipe.getNameOfRecipe)) {
                throw new RuntimeException("Такой рецепт");
            }
        }
        recipes.add(recipe);
    }

}


