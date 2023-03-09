package pro.sky.recipesbook.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.recipesbook.model.Recipe;
import pro.sky.recipesbook.services.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        Recipe newRecipe = recipeService.addRecipe(recipe);
        return ResponseEntity.ok(newRecipe);
    }

    @GetMapping("/{recipeId}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable int recipeId) {
        Recipe recipe = recipeService.getRecipe(recipeId);
        if (recipe == null) {
            return ResponseEntity.notFound().build();
        }
        else return ResponseEntity.ok(recipe);
    }
}
