package systemIn;

import process.Drink;

public class SystemInDrinks {
	SystemIn systemInDrinks = new SystemIn();
	public Drink drinks = new Drink();
	
	public void drinkChoice(Drink drink) {//USU�RIO ESCOLHE QUAL BEBIDA DESEJA
		int count = 1;
		
		System.out.println("Quantas bebidas voc� deseja? (Informe apenas n�meros)");
		drinks.setDrinksQuantity(systemInDrinks.throwAnswer());;//SETA NA CLASSE DRINK A QUANTIDADE DE BEBIDAS QUE O USU�RIO DESEJA
		System.out.println("Card�pio de Bebidas: \n"
					 + "    Bebidas                     Valores \n"
					 + "[1] Coca-Cola 2L                 R$9,50 \n"
					 + "[2] Cerveja Heineken 330ml       R$6,50 \n"
					 + "[3] Suco Pratz 900ml            R$12,50 \n"
					 + "[4] �gua Mineral 600ml           R$3,50 \n");
		do {//LA�O PARA REPETIR PERGUNTA DE ESCOLHA DE BEBIDA DE ACORDO COM A QUANTIDADE DE BEBIDA INDICADA PELO USU�RIO
			System.out.println("Escolha a " + count + "� bebida: ");
			drink.setDrinks(systemInDrinks.throwAnswer());;//SETA NA CLASSE DRINK A BEBIDA QUE O USU�RIO SELECIONA, REPETINDO A PERGUNTA DE ACORDO COM A QUANTIDADE DE BEBIDAS QUE ELE INDICOU
			count++;
		} while (count <= Integer.parseInt(drinks.getDrinksQuantity()));
	}
}
