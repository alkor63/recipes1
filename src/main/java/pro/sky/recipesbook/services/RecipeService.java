package pro.sky.recipesbook.services;

import pro.sky.recipesbook.model.Recipe;

public interface RecipeService {
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(int recipeId);
}
