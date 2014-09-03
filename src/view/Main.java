package view;

import java.util.ArrayList;

import model.Category;
import model.Ingredient;
import model.Recipe;
import model.dao.CategoryDAO;
import model.dao.IngredientDAO;

public class Main {
	public static void main(String[] args) {

		/*
		 * 1 - it creates a category called dessert and saves it into the
		 * database using CategoryDAO, then it creates a recipe that has as
		 * category the object category created before (dessert), but before
		 * saving the recipe into the database, I create two ingredients (rice
		 * and beans) and save them into the database. I made this little piece
		 * of code just to populate the database with some information to test
		 * if everything was ok.
		 */
		//
		// Category category = new Category();
		// category.setName("dessert");
		// new CategoryDAO().createCategory(category);
		//
		// Recipe recipe = new Recipe();
		// recipe.setCategory(category);
		// recipe.setDirectionsForPreparation("First things first.");
		// recipe.setTitle("Recipe 1");
		//
		// Ingredient ingredient1 = new Ingredient();
		// ingredient1.setName("rice");
		// new IngredientDAO().createIngredient(ingredient1);
		//
		// Ingredient ingredient2 = new Ingredient();
		// ingredient2.setName("beans");
		// new IngredientDAO().createIngredient(ingredient2);
		//
		// recipe.getIngredients().add(ingredient1);
		// recipe.getIngredients().add(ingredient2);
		// new RecipeDAO().createRecipe(recipe);

		/*
		 * 2 - this second part, after the creation, it's responsible for taking
		 * all the ingredients from the database and then looking for the
		 * recipes that contain the current ingredient being processed in the
		 * for. So, the "recipe 1" created before has both rice and beans, so
		 * when the user wants to sort by ingredients, we can take the
		 * ingredient list from the database, select the one the user wants and
		 * then show the recipes that has this ingredient. In this little
		 * example, the output is "rice: recipe 1" and "beans: recipe 1" because
		 * recipe 1 has both ingredients and I'm just printing everything and
		 * not selecting a specefic ingredient.
		 */

		// ArrayList<Ingredient> i = (ArrayList<Ingredient>) new
		// IngredientDAO().findAll();
		// for (Ingredient ingredient : i) {
		// System.out.println(ingredient+": "+ ingredient.getRecipes());
		// }

		/*
		 * 3 - this thirs part is almost the same as the part before, but it
		 * takes all the categories and then prints the recipes that are from
		 * the category 'x'.
		 */

		// ArrayList<Category> c = (ArrayList<Category>) new CategoryDAO()
		// .findAll();
		// for (Category category : c) {
		// System.out.println(category + ": " + category.getRecipes());
		// }
	}
}
