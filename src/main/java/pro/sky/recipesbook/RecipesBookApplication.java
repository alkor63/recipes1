package pro.sky.recipesbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.sky.recipesbook.model.Ingredient;
import pro.sky.recipesbook.model.Recipe;
import pro.sky.recipesbook.services.Impl.RecipeServiceImpl;
import pro.sky.recipesbook.services.RecipeService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RecipesBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipesBookApplication.class, args);
/*
		List<Ingredient> ingredients0 = new ArrayList<>();
		Ingredient ingredient = new Ingredient("Творог",350,"г");
		ingredients0.add(ingredient);
		ingredient = new Ingredient("Куриное яйцо",2,"штуки");
		ingredients0.add(ingredient);
		ingredient = new Ingredient("Пшеничная мука",6,"столовых ложек");
		ingredients0.add(ingredient);
		ingredient = new Ingredient("Сахар",2,"столовые ложки");
		ingredients0.add(ingredient);

		List<String> cookingSteps0 = new ArrayList<>();
		cookingSteps0.add("Смешайте весь творог с яйцами, сахаром и тщательно всё перемешайте");
		cookingSteps0.add("Всыпьте в творог муку и тщательно перемешайте");
		cookingSteps0.add("Поставьте сковороду на средний огонь и налейте в нее подсолнечное масло");
		cookingSteps0.add("Слепите несколько небольших шариков из получившейся творожной массы и положите их на тарелку. Затем по очереди обкатывайте творожные шарики в муке и выкладывайте на сковороду");
		cookingSteps0.add("Обжаривайте сырники 1–2 минуты до появления золотистой корочки. Затем переверните их на другую сторону и также обжарьте до золотистого состояния");
		cookingSteps0.add("Повторяйте, пока творог не закончится");

		Recipe recipe0 = new Recipe("Сырники из творога",40, ingredients0, cookingSteps0);
		RecipeServiceImpl.addRecipe(recipe0);
		System.out.println(RecipeServiceImpl.getRecipe(1));

		List<Ingredient> ingredients2 = new ArrayList<>();
		ingredient = new Ingredient("Красная чечевица",150,"г");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Репчатый лук",1,"головка");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Морковь",1,"штука");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Подсолнечное масло",30,"мл");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Лимон", 1,"штука");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Сливочное масло",15,"г");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Пшеничная мука",30,"г");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Сливки 33%",50,"мл");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Специи",0,"по вкусу");
		ingredients2.add(ingredient);
		ingredient = new Ingredient("Мята",0,"по вкусу");
		ingredients2.add(ingredient);
		List<String> cookingSteps2 = new ArrayList<>();
		cookingSteps2.add("В небольшую кастрюлю налить литр воды и засыпать промытую чечевицу. Поставить кастрюлю на средний огонь");
		cookingSteps2.add("Натереть небольшую морковь на крупной терке, мелко нарезать лук. Как только чечевица начнет кипеть, надо убавить огонь, а затем долить еще 200 мл воды или бульона. Варить еще десять минут");
		cookingSteps2.add("Разогреть широкую плоскую сковороду, добавить туда подсолнечное и сливочное масло. Обжарить лук и морковь");
		cookingSteps2.add("Добавить обжаренные овощи в кастрюлю, влить сливки. Взбить суп ручным блендером, чтобы он превратился в густое пюре. Суп можно подавать к столу");

		Recipe recipe2 = new Recipe("Чечевичный суп с мятой",30, ingredients2, cookingSteps2);
		RecipeServiceImpl.addRecipe(recipe2);
*/
	}
}