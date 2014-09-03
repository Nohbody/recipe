package Recipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Brian Trethewey on 8/31/2014.
 *
 * Class to assist in sorting recipes
 */
public class Sorting {
    //private level variables
    private List<String> ingredientList;
    private HashMap<String,List> ingredientMap;
    private List<String> cuisineList;
    private HashMap<String,List> cuisineMap;

    /**
     * Allows for the sorting of recipes by what ingredients are in them each recipie will be added into all lists in the hashmap that are in its ingriedients list and then we will return the hasmap, a list of keys for the hasmap will also be vavalible through a get method so that a full list can be populated easily
     */
    public Sorting() {
        ingredientList = new ArrayList();
        ingredientMap = new HashMap();
        cuisineList = new ArrayList();
        cuisineMap = new HashMap();
    }

    public List sort(List list){
		Collections.sort(list);
    	return list;

    }

    public HashMap sortbyIngredients(List<Recipe> recipeList) {

        //body of sorting function for each recipe loops ahoy(Look into a cleaner and faster way to perform this)
        for (Recipe recipe : recipeList) {

            for (IngredientTuple ingredient : recipe.getIngredientList()) {
                String key = ingredient.getIngredientName();

                if (ingredientMap.containsKey(key)) {
                    ingredientMap.get(key).add(recipe);
                } else {
                    List newList = new ArrayList<Recipe>();
                    newList.add(recipe);
                    ingredientMap.put(key, newList);
                    ingredientList.add(key);
                }
            }
        }
        return ingredientMap;

    }


    public HashMap sortbyCategory(List<Recipe> recipeList) {

        //body of sorting function for each recipe loops ahoy(Look into a cleaner and faster way to perform this)
        for (Recipe recipe : recipeList) {

                String key = recipe.getCategory();

                if (cuisineMap.containsKey(key)) {
                    cuisineMap.get(key).add(recipe);
                } else {
                    List newList = new ArrayList<Recipe>();
                    newList.add(recipe);
                    cuisineMap.put(key, newList);
                    cuisineList.add(key);
                }
            }

        return cuisineMap;

    }
}
