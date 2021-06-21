package process;

public class Calculate {
	private double pizzaBordAdditional;
	private double pizzaSizeValue;
	private double pizzaFlavorValue;
	private double drinkValue;
	private double totalValue;
		
	public void calculatePizzaOrder(Order order) {
		validatePizzaOrder(order);
		
		if (order.getOrderPizzaWithBordYesNo().equals("1")) {
			totalValue = pizzaSizeValue + pizzaFlavorValue + pizzaBordAdditional;
			order.setTotalOrderValue(totalValue);
		} else
			totalValue = pizzaSizeValue + pizzaFlavorValue;
			order.setTotalOrderValue(totalValue);
	}
	
	public void calculateDrinkOrder(Order order) {
		validateDrinkOrder(order);
		totalValue = drinkValue;
		order.setTotalOrderValue(totalValue);
	}
	
	public void calculatePizzaAndDrinkOrder(Order order) {
		calculatePizzaOrder(order);
		calculateDrinkOrder(order);
	}
	
	public void validatePizzaAndDrinkOrder(Order order) {
		validatePizzaSizeValue(order);
		validatePizzaFlavorValue(order);
		validateDrinkValue(order);
		validateBordAdditional(order);
	}

	public void validatePizzaOrder(Order order) {
		validatePizzaSizeValue(order);
		validatePizzaFlavorValue(order);
		validateBordAdditional(order);
	}
	public void validateDrinkOrder(Order order) {
		validateDrinkValue(order);
	}
	
	public void validateBordAdditional(Order order) {
		if (order.getOrderPizzaWithBordYesNo().equals("S")) {
			if (order.getOrderPizzaBordFlavor().contains("Cheedar")) {pizzaBordAdditional = pizzaBordAdditional + 0.00; }
			if (order.getOrderPizzaBordFlavor().contains("Catupiry")) {pizzaBordAdditional = pizzaBordAdditional + 0.00;}
			if (order.getOrderPizzaBordFlavor().contains("1/2")) {pizzaBordAdditional = pizzaBordAdditional + 3.00; }
			if (order.getOrderPizzaBordFlavor().contains("Nutella")) {pizzaBordAdditional = pizzaBordAdditional + 2.00;}
			} else return;
	}
	
	public void validatePizzaSizeValue(Order order) {
		if (order.getOrderPizzaWithBordYesNo().equals("S")) {
			if(order.getOrderPizzaFlavors().contains("Gigante")) {pizzaSizeValue = 80.00;};
			if(order.getOrderPizzaFlavors().contains("Família")) {pizzaSizeValue = 69.50;};
			if(order.getOrderPizzaFlavors().contains("Média")) {pizzaSizeValue = 56.50;};
			if(order.getOrderPizzaFlavors().contains("Pequena")) {pizzaSizeValue = 44.50;};
		} else {
			if(order.getOrderPizzaFlavors().contains("Gigante")) {pizzaSizeValue = 75.00;};
			if(order.getOrderPizzaFlavors().contains("Família")) {pizzaSizeValue = 66.00;};
			if(order.getOrderPizzaFlavors().contains("Média")) {pizzaSizeValue = 52.00;};
			if(order.getOrderPizzaFlavors().contains("Pequena")) {pizzaSizeValue = 42.00;};
		}
	}
	public void validatePizzaFlavorValue(Order order) {
		if(order.getOrderPizzaFlavors().contains("5 Queijos")) {pizzaFlavorValue = pizzaFlavorValue + 0.00;};
		if(order.getOrderPizzaFlavors().contains("Frango Catupiry")) {pizzaFlavorValue = pizzaFlavorValue + 0.00;};
		if(order.getOrderPizzaFlavors().contains("Abacaxi com Canela")) {pizzaFlavorValue = pizzaFlavorValue + 0.00;};
		if(order.getOrderPizzaFlavors().contains("Calabresa")) {pizzaFlavorValue = pizzaFlavorValue + 0.00;};
		if(order.getOrderPizzaFlavors().contains("Chocolate")) {pizzaFlavorValue = pizzaFlavorValue + 0.00;};
		if(order.getOrderPizzaFlavors().contains("Prestígio")) {pizzaFlavorValue = pizzaFlavorValue + 0.00;};
		if(order.getOrderPizzaFlavors().contains("Salmão com Alcaparras")) {pizzaFlavorValue = pizzaFlavorValue + 4.00;};
		if(order.getOrderPizzaFlavors().contains("Camarão")) {pizzaFlavorValue = pizzaFlavorValue + 4.50;};
		if(order.getOrderPizzaFlavors().contains("Cheddar")) {pizzaFlavorValue = pizzaFlavorValue + 3.50;};
	}
	public void validateDrinkValue(Order order) {
		if(order.getOrderDrinks().contains("Coca-Cola 2L")) {drinkValue = drinkValue + 9.50;};
		if(order.getOrderDrinks().contains("Cerveja Heineken 330ml")) {drinkValue = drinkValue + 6.50;};
		if(order.getOrderDrinks().contains("Suco Pratz 900ml")) {drinkValue = drinkValue + 12.50;};
		if(order.getOrderDrinks().contains("Água Mineral 600ml")) {drinkValue = drinkValue + 3.50;};
	}
	
	public double getTotalValue() {
		return totalValue;
	}
}
