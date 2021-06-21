package systemIn;

import java.util.Scanner;

import process.Drink;
import process.Pizza;

public class SystemIn {
	
	private String ans;
    Scanner answer = new Scanner(System.in);
	
    public String throwAnswer() {//EXECUTOR E ARMAZENAMENTO DE ENTRADAS DE DADOS, QUALQUER QUE SEJA
    	ans = answer.nextLine();
    	return ans;
    }
    
    public void pizzaSystemIn(Pizza pizza) { //EXECUTOR DE ENTRADAS PARA A PIZZA
    	SystemInPizza systemInPizza = new SystemInPizza();
    	
    	systemInPizza.pizzaSizeSystemIn(pizza); //ENCAMINHA PARA A ENTRADA DE TAMANHO
    	systemInPizza.pizzaFlavorQuantitySystemIn(pizza); //ENCAMINHA PARA ENTRADA DE QUANTIDADE DE SABORES
    	systemInPizza.pizzaFlavorSystemIn(pizza); //ENCAMINHA PARA ENTRADA DE SABORES
    	systemInPizza.pizzaWithBordYesNo(pizza); //ENCAMINHA PARA ENTRADA DE "SE" DESEJA BORDA
    
    }
    
    public void pizzaBrotoSystemIn(Pizza broto) {
    	SystemInPizza systemInPizzaBroto = new SystemInPizza();
    	
    	systemInPizzaBroto.pizzaFlavorQuantitySystemIn(broto);
    	systemInPizzaBroto.pizzaFlavorSystemIn(broto);
    }
    
    public void drinkSystemIn(Drink drink) {//EXECUTOR DE ENTRADAS PARA BEBIDAS
    	SystemInDrinks systemInDrink = new SystemInDrinks();

    	systemInDrink.drinkChoice(drink); //ENCAMINHA PARA ENTRADA DE BEBIDAS
    }
    
    
    
    public String getAns() {
    	return ans; 
    }
}
