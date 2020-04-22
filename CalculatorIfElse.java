import java.util.Scanner;

public class CalculatorIfElse {

	private static Scanner scanner = new Scanner(System.in);
	private static double a, b;

	private static double readInput(int i) {
		while (true) {
			System.out.print("Introduzca número " + i + ": ");
			String s = scanner.nextLine();
			try {
				double x = Double.parseDouble(s);
				return x;
			}
			catch (Exception e) {
				System.out.println("\"" + s + "\" no puede ser interpretado como un numéro, intente de nuevo.\n");
			}
		}
	}

	private static void calculate() {
		while (true) {
			System.out.println("\n¿Qué operación desea realizar?");
			System.out.println("\t1) Suma");
			System.out.println("\t2) Resta");
			System.out.println("\t3) Multiplicación");
			System.out.println("\t4) División");

			String s = scanner.nextLine();
			if (s.equals("1")) {
				System.out.format("\n%f %s %f = %f\n\n", a, "+", b, a + b);
				return;
			} else if (s.equals("2")) {
				System.out.format("\n%f %s %f = %f\n\n", a, "-", b, a - b);
				return;	
			} else if (s.equals("3")) {
				System.out.format("\n%f %s %f = %f\n\n", a, "*", b, a * b);
				return;
			} else if (s.equals("4")) {
				double ans = Double.NaN;
				if (b != 0)
					ans = a / b;
				System.out.format("\n%f %s %f = %f\n\n", a, "/", b, ans);
				return;
			} else {
				System.out.println("¡Opción inválida!");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("============= CALCULADORA =============\n");
		
		boolean exit = false;
		while (!exit) {
			System.out.println("¿Qué desea hacer?");
			System.out.println("\t1) Realizar una operación.");
			System.out.println("\t2) Salir.\n");

			String s = scanner.nextLine();
			if (s.equals("1")) {
				a = readInput(1);
				b = readInput(2);
				calculate();
				exit = true;
			} else if (s.equals("2")) {
				System.out.println("Saliendo de programa...");
				scanner.close();
				return;	
			} else {
				System.out.println("¡Opción inválida!\n");
			}
		}

		while (true) {
			System.out.println("¿Qué desea hacer?");
			System.out.println("\t1) Realizar otra operación con los mismos números.");
			System.out.println("\t2) Realizar otra operación con números diferentes.");
			System.out.println("\t3) Salir.\n");

			String s = scanner.nextLine();
			if (s.equals("1")) {
				calculate();
			} else if (s.equals("2")) {
				a = readInput(1);
				b = readInput(2);
				calculate();
			} else if (s.equals("3")) {
				System.out.println("Saliendo de programa...");
				scanner.close();
				return;	
			} else {
				System.out.println("¡Opción inválida!\n");
			}
		}
	}

}

//System.out.println("");