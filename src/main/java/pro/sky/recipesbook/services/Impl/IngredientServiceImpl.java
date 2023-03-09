package pro.sky.recipesbook.services.Impl;

import org.springframework.stereotype.Service;
import pro.sky.recipesbook.model.Ingredient;
import pro.sky.recipesbook.services.IngredientService;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private static Map<Integer, Ingredient> ingredients = new HashMap<>();
    private static int ingredientId = 0;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        ingredients.putIfAbsent(ingredientId++, ingredient);
        return ingredient;
    }

    @Override
    public Ingredient getIngredient(int ingredientId) {
        return ingredients.get(ingredientId);
    }
}
