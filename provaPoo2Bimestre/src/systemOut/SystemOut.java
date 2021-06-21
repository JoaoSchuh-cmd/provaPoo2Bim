package systemOut;

import process.Calculate;
import process.Order;

public class SystemOut {
	
	public void outPrintPizzaOrder(Order order) {
		System.out.println(
				"Tamanho da pizza: " + order.getOrderPizzaSize() + "\n"
			  + "Sabores da pizza: " + order.getOrderPizzaFlavors() + "\n"
			  + "Sabor da borda: "   + order.getOrderPizzaBordFlavor() + "\n"
			  + "Valor Total: R$" + order.getTotalOrderValue()
		);
	}
	public void outPrintDrinkOrder(Order order) {
		System.out.println(
				"Bebida: " + order.getOrderDrinks() + "\n"
			  + "Valor Total: R$" +  order.getTotalOrderValue()
			  );
		
	}
	public void outPrintAll(Order order, Calculate calculate) {
		outPrintPizzaOrder(order);
		outPrintDrinkOrder(order);
		System.out.println("Valor Total: R$" +  order.getTotalOrderValue()
		);
	}
}
