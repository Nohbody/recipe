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

@Entity(name="ingredient")
public class Ingredient {
	@Id
	@GeneratedValue
	private Long idIngredient;

	@Column(name="name")
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY)  
	@JoinTable(name = "recipe_x_ingredient",  
	joinColumns = { @JoinColumn(name = "idIngredient",  
	updatable =  false) }, inverseJoinColumns = {  
	@JoinColumn(name = "idRecipe", updatable = false) })
	private List<Recipe> recipes = new ArrayList<Recipe>();

	public Long getIdIngredient() {
		return idIngredient;
	}

	public void setIdIngredient(Long idIngredient) {
		this.idIngredient = idIngredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName();
	}
}
