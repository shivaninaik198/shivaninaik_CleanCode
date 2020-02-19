package epam.HT4.HomeTask4;


public class Main {

	public static void main(String[] args) {
		CalculateInterest calculateInterest = new CalculateInterest();
		calculateInterest.read();
		ConstructionCost constructioncost = new ConstructionCost();
		constructioncost.menu();
	}

}
