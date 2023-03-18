package target_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();

		for (int i = frase.length(); i > 0; i--) {
			System.out.printf("%c", frase.charAt(i - 1));
		}
		sc.close();
	}
}
