package view;

import java.util.Scanner;

import br.edu.fateczl.list.List;
import controller.ChocolateController;
import model.Chocolate;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unchecked")
		List<Chocolate>[] hashtable = new List[5];
		for(int i = 0; i < 5; i++) {
			hashtable[i] = new List<Chocolate>();
		}
		ChocolateController controller = new ChocolateController();
		int option = -1;
		while (option != 0) {
			try {
				option = showMenu(sc);
				switch (option) {
				case 1:
					System.out.print("Volume: ");
					controller.addChocolate(hashtable, new Chocolate(Double.parseDouble(sc.nextLine().trim())));
					break;
				case 2:
					controller.listChocolatesAmount(hashtable);
					break;
				case 0:
					System.out.println("Ending...");
					break;
				default:
					throw new Exception("Invalid option!");
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} 
		}
		sc.close();

	}
	
	public static int showMenu(Scanner sc) throws Exception {
		System.out.println("---- Wonka's Chocolate Manager ----");
		System.out.println("[1] Register chocolate");
		System.out.println("[2] Chocolates amount");
		System.out.println("[0] Exit");
		System.out.print("> ");
		return Integer.parseInt(sc.nextLine().trim());
	}

}
