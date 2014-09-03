package Recipe;
/**
 * Created by Brian Trethewey on 8/31/2014.
 *
 * Class to help quntify ingredients in a easier to process manner
 */
public class IngredientTuple {
    private String ingredientName;
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  ingredientName  +": "+ amount ;
    }
}
