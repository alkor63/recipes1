package pro.sky.recipesbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Recipe {
    private String name;
    private int cookingTimeInMinutes;
    private List<Ingredient> ingredients;
    private List<String> cookingSteps;
}