import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean validator = false;
        char letter = ' ';

        do {
            System.out.print("Digite la letra a revisar: ");
            String input = entrada.nextLine();

            if (!input.isEmpty()) {
                letter = input.charAt(0);
                validator = true;
            } else {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        } while (!validator);

        // if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||
        // letter == 'u' || letter == 'A'
        // || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
        if ("aeiouAEIOU".indexOf(letter) != -1) {
            System.out.printf("%c, es una vocal.\n", letter);
            validator = true;
        } else {
            System.out.printf("%c, no es una vocal.\n", letter);
        }
    }
}
