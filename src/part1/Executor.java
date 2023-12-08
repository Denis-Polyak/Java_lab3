package part1;
import java.util.Arrays;
import java.util.Scanner;

import static part1.Main.operationsOnStrings;


public class Executor {
    public static class TextReplacement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть текст: ");
            String text = scanner.nextLine();

            System.out.print("Введіть рядок для заміни: ");
            String replacement = scanner.nextLine();

            System.out.print("Введіть довжину слів, які треба замінити: ");
            int length = scanner.nextInt();
            scanner.nextLine();

            String result = operationsOnStrings(text, replacement, length);
            System.out.println(result);
        }
    }
}

