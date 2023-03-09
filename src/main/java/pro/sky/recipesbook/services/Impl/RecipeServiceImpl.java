package pro.sky.recipesbook.services.Impl;

import org.springframework.stereotype.Service;
import pro.sky.recipesbook.model.Recipe;
import pro.sky.recipesbook.services.RecipeService;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private Map<Long, Recipe> recipes = new HashMap<>();
    private Long recId = 1L;
@Override
    public Long getRecId() {
        return recId;
    }

    @Override
    public Map<Long, Recipe> getRecipes() {
        return recipes;
    }

 //   public Long getRecipeId() {        return recId;    }
    //    public Map<Long, Recipe> getRecipes() { return recipes;  }

    @Override
    public Recipe addRecipe(Recipe recipe) {
        if (!recipes.containsValue(recipe)){
        recipes.put(recId++, recipe);}
        else System.out.println("Рецепт "+recipe.getName()+" уже есть в этой книге");
        return recipe;
    }

    @Override
    public Recipe getRecipe(Long recipeId) {
        return recipes.get(recipeId);
    }

    @Override
    public Recipe editRecipe(Long recipeId, Recipe recipe) {
        if (recipes.containsKey(recipeId)) {
            recipes.put(recipeId, recipe);
            return recipe;
        }
        return null;
    }
    @Override
    public void deleteAllRecipes(){
        recipes.clear();
    }

    @Override
    public boolean deleteRecipe(Long recipeId) {
        if (recipes.containsKey(recipeId)) {
            recipes.remove(recipeId);
            return true;
        }
        return false;
    }
}
