package Java.designpatterns;

import java.util.HashSet;
import java.util.Set;

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		
	FoodAbstract vegAbstract =	FoodServeFactoryPattern.getFood("Veg1");
	System.out.println("Bill :-> " + vegAbstract.getBill());
	System.out.println("Items :-> " +vegAbstract.getItems());
		
	}
}

class Veg extends FoodAbstract{
	public Veg() {
		super(100);
		items.add("Idly");
		items.add("Dosa");
	}
}

class NonVeg extends FoodAbstract {
	public NonVeg() {
		super(120);
		items.add("Biriyani");
		items.add("Chicken");
	}
}


class FoodServeFactoryPattern{
	public static FoodAbstract getFood(String foodRequest)
	{
		if(foodRequest.equalsIgnoreCase("Veg")) {
			
			return new Veg();
		}
		else if(foodRequest.equalsIgnoreCase("NonVeg")) {
			return new NonVeg();
		}
		else {
			System.out.println("we are notserving :->" + foodRequest);
			return null;
		}
	}
}

abstract class FoodAbstract {

	protected double bill;
	protected Set<String> items;

	public double getBill() {
		return bill;
	}


	public Set<String> getItems() {
		return items;
	}

	public FoodAbstract() {
		super();
	}

	public FoodAbstract(double bill) {
		this.bill = bill;
		this.items = new HashSet<String>();
	}
}