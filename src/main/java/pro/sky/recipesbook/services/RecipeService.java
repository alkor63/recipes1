package pro.sky.recipesbook.services;

import pro.sky.recipesbook.model.Recipe;

import java.util.List;
import java.util.Map;

public interface RecipeService {

    Long getRecId();

    Map<Long, Recipe> getRecipes();

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipe(Long recipeId);

    List<Recipe> getAllRecipes();

    Recipe editRecipe(Long recipeId, Recipe recipe);

    void deleteAllRecipes();

    boolean deleteRecipe(Long recipeId);
}
