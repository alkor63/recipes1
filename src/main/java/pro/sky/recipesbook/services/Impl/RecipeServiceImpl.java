package pro.sky.recipesbook.services.Impl;

import org.springframework.stereotype.Service;
import pro.sky.recipesbook.model.Recipe;
import pro.sky.recipesbook.services.RecipeService;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private static Map<Integer, Recipe> recipes = new HashMap<>();
    private static int recipeId = 0;


    @Override
    public Recipe addRecipe(Recipe recipe) {
        recipes.putIfAbsent(recipeId++, recipe);
        return recipe;
    }

    @Override
    public Recipe getRecipe(int recipeId) {
        return recipes.get(recipeId);
    }
}
