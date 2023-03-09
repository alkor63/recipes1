package pro.sky.recipesbook.services;

import pro.sky.recipesbook.model.Ingredient;
import pro.sky.recipesbook.model.Recipe;

import java.util.List;

public interface IngredientService {
    int getIngId();

    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(int ingredientId);

    List<Ingredient> getAllIngredients();

    Ingredient editIngredient(int ingredientId, Ingredient ingredient);

    void deleteAllIngredients();

    boolean deleteIngredient(int ingredientId);
}
