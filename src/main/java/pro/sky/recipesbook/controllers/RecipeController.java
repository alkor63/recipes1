package pro.sky.recipesbook.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.recipesbook.model.Ingredient;
import pro.sky.recipesbook.model.Recipe;
import pro.sky.recipesbook.services.Impl.RecipeServiceImpl;
import pro.sky.recipesbook.services.RecipeService;

import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Recipe> getRecipe(@PathVariable Long recipeId) {
        Recipe recipe = recipeService.getRecipe(recipeId);
        if (recipe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }

    @PutMapping("/{recipeId}")
    public ResponseEntity<Recipe> editRecipe(@PathVariable Long recipeId, @RequestBody Recipe recipe) {
        Recipe newRecipe = recipeService.editRecipe(recipeId, recipe);
        if (newRecipe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(newRecipe);
    }

    @DeleteMapping("/{recipeId}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable long recipeId) {
        if (recipeService.deleteRecipe(recipeId)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllRecipes() {
        recipeService.deleteAllRecipes();
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        List<Recipe> allRecipes = recipeService.getAllRecipes();
        if (allRecipes.size() > 0) {
            return ResponseEntity.ok(allRecipes);
        }
        return ResponseEntity.notFound().build();
    }


}
