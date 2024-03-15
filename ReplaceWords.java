import Laborator1.TextUtil;

import java.util.Scanner;

public class ReplaceWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți textul:");
        String text = scanner.nextLine();

        System.out.println("Textul introdus:");
        System.out.println(text);

        System.out.println("Introduceți lungimea cuvintelor care trebuie înlocuite:");
        int lungime = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Introduceți subșirul cu care să fie înlocuite cuvintele de lungime specificată:");
        String subSir = scanner.nextLine();

        // Înlocuiește cuvintele de lungime `lungime` cu subșirul `subSir`
        String newText = TextUtil.replaceWords(text, lungime, subSir);

        System.out.println("Textul modificat: " + newText);

        scanner.close();
    }
}