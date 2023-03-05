package pro.sky.recipesbook.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.recipesbook.model.Ingredient;
import pro.sky.recipesbook.model.Recipe;
import pro.sky.recipesbook.services.IngredientService;

@RestController
@RequestMapping("/ingredient")

public class IngredientController {

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @PostMapping
    public ResponseEntity<Ingredient> createIngredient(@RequestBody Ingredient ingredient) {
        Ingredient newIngredient = ingredientService.addIngredient(ingredient);
        return ResponseEntity.ok(newIngredient);
    }

    @GetMapping("/{ingredientId}")
    public ResponseEntity<Ingredient> getIngredient(@PathVariable int ingredientId) {
        Ingredient ingredient = ingredientService.getIngredient(ingredientId);
        if (ingredient == null) {
            return ResponseEntity.notFound().build();
        }
        else return ResponseEntity.ok(ingredient);
    }
}
