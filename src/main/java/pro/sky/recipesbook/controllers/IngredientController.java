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

    @PutMapping("/{ingredientId}")
    public ResponseEntity<Ingredient> editIngredient(@PathVariable int ingredientId, @RequestBody Ingredient ingredient) {
        Ingredient newIngredient = ingredientService.editIngredient(ingredientId, ingredient);
        if (newIngredient == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(newIngredient);
    }

    @DeleteMapping("/{ingredientId}")
    public ResponseEntity<Void> deleteIngredient(@PathVariable int ingredientId) {
        if (ingredientService.deleteIngredient(ingredientId)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllIngredient() {
        ingredientService.deleteAllIngredients();
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Ingredient> getAllIngredients() {
        int j=0;
        for (int i = 1; i <= ingredientService.getIngId(); i++) {
            Ingredient recipe = ingredientService.getIngredient(i);
            if (recipe != null) j++;
        }
        if (j >0) {
            System.out.println("В нашем рецепте "+j+" ингредиентов");
            return ResponseEntity.ok().build();}
        return ResponseEntity.notFound().build();
    }

}
