package process;

import java.util.ArrayList;

public class Order {
	//MUDAR O TIPO DE ARMAZENAMENTO DAS VARIAVEIS DE TAMANHO E SABORES DE NÚMERO PARA A DESCRIÇÃO;
	//FAZER CLASSE ORDEM QUE PUXARA OS VALORES DE PIZZA E BEBIDAS;
//	SystemInPizza systemInPizza = new SystemInPizza();
//	SystemInDrinks systemInDrinks = new SystemInDrinks();
//	
	//VALORES DE PIZZAS
	private String pizzaSize;
	private ArrayList <String> pizzaFlavors = new ArrayList();
	private String pizzaWithBordYesNo;
	private String pizzaBordFlavor;
	private double totalOrderValue;
	//**********************
	
	//VALORES DE BEBIDAS
	private ArrayList <String> drink = new ArrayList();
	//*****************
	
	public void pizzaOrder(Pizza pizza) {
		if (pizza.getPizzaSize().equals("5")) {
			pizzaValidateSize(pizza);
			pizzaValidateFlavors(pizza);
			pizzaBordFlavor = "Não disponível para pizzas Broto";
			return;
		}
		pizzaValidateSize(pizza);
		pizzaValidateFlavors(pizza);
		pizzaValidateBordFlavors(pizza);
		
	}
	
	public void drinksOrder(Drink drink) {
		drinksValidate(drink);
	}
	
	public void pizzaAndDrinkOrder(Pizza pizza, Drink drink) {
		pizzaOrder(pizza);
		drinksOrder(drink);
	}
	
	//VALIDAÇÕES DOS VALORES DE BEBIDAS
	public void drinksValidate(Drink drinks) {
		if (drinks.getDrinks().contains("1")) {drink.add("Coca-Cola 2L");}
		if (drinks.getDrinks().contains("2")) {drink.add("Cerveja Heineken 330ml");}
		if (drinks.getDrinks().contains("3")) {drink.add("Suco Pratz 900ml");}
		if (drinks.getDrinks().contains("4")) {drink.add("Água Mineral ");}
	}
	//*********************************
	
	//VALIDAÇÕES DOS VALORES DAS PIZZAS
	public int pizzaValidateSize(Pizza pizza) {
		if (pizza.getPizzaSize().equals("1")) {pizzaSize = "Gigante"; return 1;};
		if (pizza.getPizzaSize().equals("2")) {pizzaSize = "Família"; return 2;};
		if (pizza.getPizzaSize().equals("3")) {pizzaSize = "Média"  ; return 3;};
		if (pizza.getPizzaSize().equals("4")) {pizzaSize = "Pequena"; return 4;};
//		if (pizza.getPizzaSize().equals("5")) {pizzaSize = "Broto"  ; return 5;};
		return 0;
	}
	public void pizzaValidateFlavors(Pizza pizza) {
		if (pizza.getPizzaFlavors().contains("1")) {pizzaFlavors.add("5 Queijos");}
		if (pizza.getPizzaFlavors().contains("2")) {pizzaFlavors.add("Frango Catupiry");}
		if (pizza.getPizzaFlavors().contains("3")) {pizzaFlavors.add("Calabresa");}
		if (pizza.getPizzaFlavors().contains("4")) {pizzaFlavors.add("Chocolate");}
		if (pizza.getPizzaFlavors().contains("5")) {pizzaFlavors.add("Prestígio");}
		if (pizza.getPizzaFlavors().contains("6")) {pizzaFlavors.add("Abacaxi com Canela");}
		if (pizza.getPizzaFlavors().contains("7")) {pizzaFlavors.add("Cheddar");}
		if (pizza.getPizzaFlavors().contains("8")) {pizzaFlavors.add("Salmão com Alcaparras");}
		if (pizza.getPizzaFlavors().contains("9")) {pizzaFlavors.add("Camarão");}
	}
	public void pizzaValidateBordFlavors(Pizza pizza) {
		if (pizza.getPizzaWithBordYesNo().equals("S")) {
			pizzaWithBordYesNo = "S";
			if (pizza.getPizzaBordFlavor().equals("1")) {pizzaBordFlavor = "Cheddar";}
			if (pizza.getPizzaBordFlavor().equals("2")) {pizzaBordFlavor = "Catupiry";}
			if (pizza.getPizzaBordFlavor().equals("3")) {pizzaBordFlavor = "1/2 Nutella 1/2 Doce de Leite";}
			if (pizza.getPizzaBordFlavor().equals("4")) {pizzaBordFlavor = "Nutella";}
		} else
//		if (pizza.getPizzaSize().equals("5")) {pizzaBordFlavor = "A pizza de tamanho Broto não possui borda";} else
		if (pizza.getPizzaWithBordYesNo().equals("N")) {pizzaBordFlavor = "Não foi selecionado borda para esta pizza.";}
		pizzaWithBordYesNo = "N";
	}
	//*****************************************
	
	
	//GETTERS AND SETTERS
	public double getTotalOrderValue() {
		return totalOrderValue;
	}
	public void setTotalOrderValue(double totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}
	public String getOrderPizzaSize() {
		return pizzaSize;
	}
	public ArrayList getOrderPizzaFlavors() {
		return pizzaFlavors;
	}
	public String getOrderPizzaBordFlavor() {
		return pizzaBordFlavor;
	}
	public ArrayList getOrderDrinks() {
		return drink;
	}
	public String getOrderPizzaWithBordYesNo() {
		return pizzaWithBordYesNo;
	}
 }
