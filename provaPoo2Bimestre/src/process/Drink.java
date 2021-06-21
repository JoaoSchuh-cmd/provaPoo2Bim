package process;

import java.util.ArrayList;

import systemIn.SystemIn;

public class Drink {
	SystemIn systemInDrinkMethod = new SystemIn();
	
	private ArrayList <String> drinks = new ArrayList();//LISTA DE BEBIDAS
	private String drinksQuantity; //QUANTIDADE DE BEBIDAS
	
	public void drinkMethod(Drink drink) {
		systemInDrinkMethod.drinkSystemIn(drink);
	}
	
	//GETTERS AND SETTERS
	public ArrayList getDrinks() {
		return drinks;
	}
	public void setDrinks(String drinks) {  
		this.drinks.add(drinks);
	}
	public String getDrinksQuantity() {
		return drinksQuantity;
	}
	public void setDrinksQuantity(String drinksQuantity) {
		this.drinksQuantity = drinksQuantity;
	}
}
