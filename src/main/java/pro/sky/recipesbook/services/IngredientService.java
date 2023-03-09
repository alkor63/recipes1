package pro.sky.recipesbook.services;

import pro.sky.recipesbook.model.Ingredient;

public interface IngredientService {
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(int ingredientId);
}
