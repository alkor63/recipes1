package pro.sky.recipesbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {
    private String ingName;
    private int ingQuantity;
    private String measureUnit;
}
