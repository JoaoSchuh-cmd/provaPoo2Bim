package process;

import java.util.ArrayList;

import systemIn.SystemIn;

public class Pizza {
	SystemIn systemInPizzaMethod = new SystemIn();
	
	private String pizzaSize; //TAMANHO DA PIZZA
	private ArrayList <String> pizzaFlavors = new ArrayList(); //LISTA DE SABORES DA PIZZA
	private String pizzaFlavorQuantityChoosen;//VARIÁVEL AUXILIAR - QUANTIDADE DE SABORES ESCOLHIDOS
	private String pizzaFlavorMaxQuantity;//VARIÁVEL AUXILIAR - QUANTIDADE MÁXIMA DE SABORES QUE DETERMINADO TAMANHO ACEITA
	private String pizzaBordFlavor;//SABOR DA BORDA
	private String pizzaWithBordYesNo;//PIZZA COM OU SEM BORDA
	
	public void pizzaMethod(Pizza pizza) {
		systemInPizzaMethod.pizzaSystemIn(pizza);
	}
	
	//GETTERS AND SETTERS DA PIZZA
	public ArrayList getPizzaFlavors() {
		return pizzaFlavors;
	}
	public void setPizzaFlavors(String pizzaFlavors) {
		this.pizzaFlavors.add(pizzaFlavors);
	}
	public String getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public String getPizzaBordFlavor() {
		return pizzaBordFlavor;
	}
	public void setPizzaBordFlavor(String pizzaEdgeFlavor) {
		this.pizzaBordFlavor = pizzaEdgeFlavor;
	}
	public String getPizzaWithBordYesNo() {
		return pizzaWithBordYesNo;
	}
	public void setPizzaWithBordYesNo(String pizzaEdgeYesNo) {
		this.pizzaWithBordYesNo = pizzaEdgeYesNo;
	}
	public String getPizzaFlavorMaxQuantity() {
		return pizzaFlavorMaxQuantity;
	}
	public void setPizzaFlavorMaxQuantity(String pizzaFlavorMaxQuantity) {
		this.pizzaFlavorMaxQuantity = pizzaFlavorMaxQuantity;
	}
	public String getPizzaFlavorQuantityChoosen() {
		return pizzaFlavorQuantityChoosen;
	}
	public void setPizzaFlavorQuantityChoosen(String pizzaFlavorQuantityChoosen) {
		this.pizzaFlavorQuantityChoosen = pizzaFlavorQuantityChoosen;
	}

}
