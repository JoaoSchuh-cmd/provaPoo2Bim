package systemIn;

import process.Pizza;

public class SystemInPizzaBroto {
	SystemIn systemInPizzaBroto = new SystemIn();
	
	//SABORES PARA PIZZA BROTO
    public void pizzaBrotoFlavorQuantitySystemIn(Pizza broto) {
    	broto.setPizzaFlavorMaxQuantity("5");
    	System.out.println("Voc� pode escolher at� " + broto.getPizzaFlavorMaxQuantity() + " sabores \n"
				 + "Quantos sabores voc� deseja escolher? \n");
    	broto.setPizzaFlavorQuantityChoosen(systemInPizzaBroto.throwAnswer());
    	validatePizzaFlavorQuantitySystemIn(
    			broto.getPizzaSize(), 
    			Integer.parseInt(broto.getPizzaFlavorMaxQuantity()),
    			Integer.parseInt(broto.getPizzaFlavorQuantityChoosen()),
    			broto
    			);
    }
    
    
    //VALIDA��O PIZZA BROTO
    public void validatePizzaFlavorQuantitySystemIn(String pizzaSize, int pizzaFlavorMaxQuantity, int pizzaFlavorQuantityChoosen, Pizza pizza) {
    	while (pizzaFlavorQuantityChoosen > pizzaFlavorMaxQuantity) {
    		System.out.println("Ops. A pizza de tamanho " + pizzaSize + " aceita no m�ximo " + pizzaFlavorMaxQuantity + " sabores.");
    		System.out.println("Voc� pode escolher at� " + pizza.getPizzaFlavorMaxQuantity() + "\n"
   				 + "Quantos sabores voc� deseja escolher? \n");
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
