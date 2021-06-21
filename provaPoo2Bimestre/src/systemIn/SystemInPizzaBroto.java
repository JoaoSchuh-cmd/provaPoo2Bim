package systemIn;

import process.Pizza;

public class SystemInPizzaBroto {
	SystemIn systemInPizzaBroto = new SystemIn();
	
	//SABORES PARA PIZZA BROTO
    public void pizzaBrotoFlavorQuantitySystemIn(Pizza broto) {
    	broto.setPizzaFlavorMaxQuantity("5");
    	System.out.println("Você pode escolher até " + broto.getPizzaFlavorMaxQuantity() + " sabores \n"
				 + "Quantos sabores você deseja escolher? \n");
    	broto.setPizzaFlavorQuantityChoosen(systemInPizzaBroto.throwAnswer());
    	validatePizzaFlavorQuantitySystemIn(
    			broto.getPizzaSize(), 
    			Integer.parseInt(broto.getPizzaFlavorMaxQuantity()),
    			Integer.parseInt(broto.getPizzaFlavorQuantityChoosen()),
    			broto
    			);
    }
    
    
    //VALIDAÇÃO PIZZA BROTO
    public void validatePizzaFlavorQuantitySystemIn(String pizzaSize, int pizzaFlavorMaxQuantity, int pizzaFlavorQuantityChoosen, Pizza pizza) {
    	while (pizzaFlavorQuantityChoosen > pizzaFlavorMaxQuantity) {
    		System.out.println("Ops. A pizza de tamanho " + pizzaSize + " aceita no máximo " + pizzaFlavorMaxQuantity + " sabores.");
    		System.out.println("Você pode escolher até " + pizza.getPizzaFlavorMaxQuantity() + "\n"
   				 + "Quantos sabores você deseja escolher? \n");
    		pizza.setPizzaFlavorQuantityChoosen(systemInPizzaBroto.throwAnswer());
    		validatePizzaFlavorQuantitySystemIn(
    				pizza.getPizzaSize(), 
    				Integer.parseInt(pizza.getPizzaFlavorMaxQuantity()), 
    				Integer.parseInt(pizza.getPizzaFlavorQuantityChoosen()),
    				pizza
    				);
    		return;
    	}
    }
}
