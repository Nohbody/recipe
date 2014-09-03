package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name="recipe")
public class Recipe {
	@Id
	@GeneratedValue
	private Long idRecipe;

	@Column(name="directionForPreparation")
	private String directionsForPreparation;

	@Column(name="title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "category")
	private Category category;
	
	@ManyToMany(fetch = FetchType.LAZY)  
	@JoinTable(name = "recipe_x_ingredient",  
	joinColumns = { @JoinColumn(name = "idRecipe",  
	updatable =  false) }, inverseJoinColumns = {  
	@JoinColumn(name = "idIngredient", updatable = false) })
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();

	public Long getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(Long idRecipe) {
		this.idRecipe = idRecipe;
	}

	public String getDirectionsForPreparation() {
		return directionsForPreparation;
	}

	public void setDirectionsForPreparation(String directionsForPreparation) {
		this.directionsForPreparation = directionsForPreparation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTitle();
	}
}
