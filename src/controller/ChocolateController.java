package controller;

import br.edu.fateczl.list.List;
import model.Chocolate;

public class ChocolateController {

	public ChocolateController() {
		super();
	}
	
	public void addChocolate(List<Chocolate>[] hashtable, Chocolate chocolate) throws Exception {
		hashtable[chocolate.hashCode()].addLast(chocolate);
	}
	
	public void listChocolatesAmount(List<Chocolate>[] hashtable) throws Exception {
		int total = 0;
		double amount = sumTypeWeight(hashtable[0]);
		total += amount;
		System.out.println("For Bombons: " + amount + "g");
		amount = sumTypeWeight(hashtable[1]);
		total += amount;
		System.out.println("For Pavês: " + amount + "g");
		amount = sumTypeWeight(hashtable[2]);
		total += amount;
		System.out.println("For Brigadeiros: " + amount + "g");
		amount = sumTypeWeight(hashtable[3]);
		total += amount;
		System.out.println("For Cakes: " + amount + "g");
		amount = sumTypeWeight(hashtable[4]);
		total += amount;
		System.out.println("For Easter Eggs: " + amount + "g");
		System.out.println("Total: " + total + "g");
	}
	
	private double sumTypeWeight(List<Chocolate> type) throws Exception {
		int size = type.size();
		double total = 0;
		for(int i = 0; i < size; i++) {
			total += type.get(i).weight();
		}
		return total;
	}

}
