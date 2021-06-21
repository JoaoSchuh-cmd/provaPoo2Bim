package main;

import process.Calculate;
import process.Drink;
import process.Order;
import process.Pizza;
import systemIn.SystemIn;
import systemOut.SystemOut;

public class Main {
	
    
    public static void main(String[] args) {
    	SystemIn enters = new SystemIn();
        Order order = new Order();
        SystemOut systemOut = new SystemOut();
        Calculate calculate = new Calculate();
        Pizza pizza = new Pizza();
        Drink drink = new Drink();
        
    	 
        System.out.println("pizzaria do Matheus \n"
        		+ "Sejam todos bem vindos, O que deseja hoje? \n"
        		+ "Digite [1] somente para pizzas \n"
        		+ "Digite [2] somente para bebidas \n"
        		+ "Digite [3] para pizzas e bebidas \n");
        enters.throwAnswer();
        
        switch (enters.getAns()) {
        	case "1": 
        		pizza.pizzaMethod(pizza);
        		order.pizzaOrder(pizza);
        		calculate.calculatePizzaOrder(order);
        		systemOut.outPrintPizzaOrder(order);
        	break;
        	case "2":
        		drink.drinkMethod(drink);
        		order.drinksOrder(drink);
        		calculate.calculateDrinkOrder(order);
        		systemOut.outPrintDrinkOrder(order);
        	break;
        	case "3":
        		pizza.pizzaMethod(pizza);
        		System.out.println("Agora vamos para as bebidas gatão (ou gatona) :)");
        		drink.drinkMethod(drink);
        		order.pizzaAndDrinkOrder(pizza, drink);
        		calculate.calculatePizzaAndDrinkOrder(order);
        		systemOut.outPrintAll(order, calculate);
        	break;
        }
    }
}
