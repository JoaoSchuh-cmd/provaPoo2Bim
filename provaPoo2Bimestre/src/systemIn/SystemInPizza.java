package systemIn;

import process.Pizza;

public class SystemInPizza {
	SystemIn systemInPizza = new SystemIn();
	
	public void pizzaSizeSystemIn(Pizza pizza) {//SELEÇÃO E ENTRADA DE DADOS PARA TAMANHO DE PIZZAS
    	System.out.println("Qual o tamanho da pizza? \n"
				 + "[1] Gigante \n"
				 + "[2] Família \n"
				 + "[3] Média \n"
				 + "[4] Pequena \n"
				 + "[5] Broto \n");
    	pizza.setPizzaSize(systemInPizza.throwAnswer());//SETA O TAMANHO DA PIZZA
    	verifyIfIsBroto(pizza);
    	setPizzaFlavorMaxQuantity(pizza.getPizzaSize(), pizza);//SETA A QUANTIDADE MÁXIMA DE SABORES PERMITIDA DE ACORDO COM O TAMANHO
    }
	
    public Pizza verifyIfIsBroto(Pizza pizza) {
    	if (pizza.getPizzaSize().equals("5")) {Pizza broto = new Pizza(); return broto;}
    	return pizza;
    }
    
    public void pizzaFlavorQuantitySystemIn(Pizza pizza) {
    	setPizzaFlavorMaxQuantity(pizza.getPizzaSize(), pizza);
    	System.out.println("Você pode escolher até " + pizza.getPizzaFlavorMaxQuantity() + " sabores \n"
				 + "Quantos sabores você deseja escolher? \n");
    	pizza.setPizzaFlavorQuantityChoosen(systemInPizza.throwAnswer());
    	validatePizzaFlavorQuantitySystemIn(
    			pizza.getPizzaSize(), 
    			Integer.parseInt(pizza.getPizzaFlavorMaxQuantity()),
    			Integer.parseInt(pizza.getPizzaFlavorQuantityChoosen()),
    			pizza
    			);
    }
    
    public void pizzaFlavorSystemIn(Pizza pizza) {
    		int count = 1;
    		System.out.println("Quais sabores você deseja escolher? (Lembrando que você pode somente " + pizza.getPizzaFlavorQuantityChoosen() + " sabores) \n"
					 + "Sabores                      Valor Adicional \n"
					 + "[1] 5 Queijo                        -        \n"
					 + "[2] Frango Catupiry                 -        \n"
					 + "[3] Calabresa                       -        \n"
					 + "[4] Chocolate                       -        \n"
					 + "[5] Prestígio                       -        \n"
					 + "[6] Abacaxi com Canela              -        \n"
					 + "[7] Cheddar                      R$3,50      \n"
					 + "[8] Salmão com alcaparras        R$4,00      \n"
					 + "[9] Camarão                      R$4,50      \n");
    		do {  
    			System.out.println("Informe o " + count + "º sabor" + " (Informe apenas números)");
    			pizza.setPizzaFlavors(systemInPizza.throwAnswer());
    			count++;
    		} while (count <= Integer.parseInt(pizza.getPizzaFlavorQuantityChoosen()));
    }
    
    public void pizzaWithBordYesNo(Pizza pizza) {
    	if (!pizza.getPizzaSize().equals("5")) {
    	System.out.println("Você deseja borda na pizza? (Se sua pizza for do tamanho BROTO ela não vai borda; INFORME [S/N])");
    	pizza.setPizzaWithBordYesNo(systemInPizza.throwAnswer());
    	
    	if (pizza.getPizzaWithBordYesNo().equals("S")) {pizzaBordFlavorChoice(pizza); return;} else {return;}
    	} 
    else {
    		System.out.println("A pizza de tamanho BROTO não acompanha borda");
    	}
    }
    
    public void pizzaBordFlavorChoice(Pizza pizza) {
    	if (pizza.getPizzaWithBordYesNo().equals("N"))  {return;} else // <- SE FOR BROTO NÃO EXECUTA OS PASSOS ABAIXO
    	{System.out.println("Sabores da Borda                         Valores Adicionais \n"
    					   + "[1] Cheedar                                   - \n"
    					   + "[2] Catupiry                                  - \n"
    					   + "[3] 1/2 Nutella 1/2 Doce de Leite          R$3,00 \n"
    					   + "[4] Nutella                                R$2,00 \n" 
    					   + "Escolha um sabor de borda: (Informe somente números e ATENTE-SE aos ADCIONAIS)");
    	pizza.setPizzaBordFlavor(systemInPizza.throwAnswer()); 
    	}
    }
    
    //MÉTODOS PARA VALIDAÇÃO
    public void setPizzaFlavorMaxQuantity(String pizzaSize, Pizza pizza) {
		if (pizzaSize.equals("1")) {pizza.setPizzaFlavorMaxQuantity("5"); }
		if (pizzaSize.equals("2")) {pizza.setPizzaFlavorMaxQuantity("4"); }
		if (pizzaSize.equals("3")) {pizza.setPizzaFlavorMaxQuantity("3"); }
		if (pizzaSize.equals("4")) {pizza.setPizzaFlavorMaxQuantity("3"); }
//		if (pizzaSize.equals("5")) {pizza.setPizzaFlavorMaxQuantity("2"); return 0;}
//		return 3;
	}
    
    
    public void validatePizzaFlavorQuantitySystemIn(String pizzaSize, int pizzaFlavorMaxQuantity, int pizzaFlavorQuantityChoosen, Pizza pizza) {
    	while (pizzaFlavorQuantityChoosen > pizzaFlavorMaxQuantity) {
    		System.out.println("Ops. A pizza de tamanho " + pizzaSize + " aceita no máximo " + pizzaFlavorMaxQuantity + " sabores.");
    		System.out.println("Você pode escolher até " + pizza.getPizzaFlavorMaxQuantity() + "\n"
   				 + "Quantos sabores você deseja escolher? \n");
    		pizza.setPizzaFlavorQuantityChoosen(systemInPizza.throwAnswer());
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
