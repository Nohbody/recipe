package model.dao;

import java.util.List;

import model.Recipe;
import model.database.GenericDAO;

public class RecipeDAO extends GenericDAO {
	public void createRecipe(Recipe recipe){
	     create(recipe);
	}
	
	public void updateRecipe(Recipe recipe){
	     update(recipe);
	}
	
	public void removeRecipe(Recipe recipe){
	     remove(recipe);
	}
	
	public  List<Recipe> findAll(){
		List<Recipe> list = findAll("recipe");
	    return list;
	}
}
