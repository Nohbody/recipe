package Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian Trethewey on 8/31/2014.
 *
 * Class to store a recipe
 */
public class Recipe implements Comparable{

    private String title;
    private String description;
    private String category;
    private List<IngredientTuple> ingredientList;
    private List<String> directions;

    //constructor
    public Recipe(){
      ingredientList = new ArrayList<IngredientTuple>();
      directions = new ArrayList<String>();
    }


    public void addIngredient(String ingredient,String amount){
        IngredientTuple newIngredient = new IngredientTuple();
        newIngredient.setIngredientName(ingredient);
        newIngredient.setAmount(amount);
        ingredientList.add(newIngredient);
    }

    public void addDirections(String newDirection){
        directions.add(newDirection);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getDirections() {
        return directions;
    }

    public List<IngredientTuple> getIngredientList() {
        return ingredientList;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString(){
        String ingredientPrintout ="";
            for(IngredientTuple ingredient:ingredientList){
                ingredientPrintout += "\t"+ ingredient.toString() +"\n";
            }
        String directionsPrintout ="";
        for(String direction:directions){
            directionsPrintout += "\t"+ direction +"\n";
        }

        return title +"\n\n"+category+":\n"+description+"\n\nIngredient:\n"+ingredientPrintout+
                "\n\nDirections\n"+directionsPrintout;
    }

    public int compareTo(Object other) {
        int result;
        if (this.getTitle().equals(((Recipe) other).getTitle()))
            result = this.getTitle().compareTo(((Recipe) other).getTitle());
        else
            result = this.getTitle().compareTo(((Recipe) other).getTitle());

        return result;
    }
}
