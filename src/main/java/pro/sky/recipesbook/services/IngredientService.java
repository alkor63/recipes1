package pro.sky.recipesbook.services;

import pro.sky.recipesbook.model.Ingredient;
import pro.sky.recipesbook.model.Recipe;

public interface IngredientService {
    int getIngId();

    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(int ingredientId);

    Ingredient editIngredient(int ingredientId, Ingredient ingredient);

    void deleteAllIngredients();

    boolean deleteIngredient(int ingredientId);
}
