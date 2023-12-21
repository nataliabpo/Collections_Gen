package collectionsList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista01 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "ª cor:");
			cores.add(leia.nextLine());
		}

		System.out.println("Listando todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("Ordenando as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
	}

}
