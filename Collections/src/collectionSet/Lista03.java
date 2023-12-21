package collectionSet;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Scanner;

	public class Lista03 {

		public static void main(String[] args) {	
			Scanner leia = new Scanner(System.in);

			HashSet<Integer> setNumeros = new HashSet<Integer>();

			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o " + (i + 1) + "º valor inteiro:");
				setNumeros.add(leia.nextInt());
			}

			System.out.println("Listar dados do Set:");
			Iterator<Integer> iterador = setNumeros.iterator();
			while (iterador.hasNext()) {
				System.out.println(iterador.next());
			}

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (i != j && setNumeros.contains(i) && setNumeros.contains(j)) {
						if (i < j) {
							setNumeros.remove(i);
						} else {
							setNumeros.remove(j);
						}
					}
				}
			}

			System.out.println("\nSet");
			iterador = setNumeros.iterator();
			while (iterador.hasNext()) {
				System.out.println(iterador.next());
			}
		}

	}


