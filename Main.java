package GenericSwapMethodString;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> names = new Box<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            names.add(input);
        }

        String[] indexes = scanner.nextLine().split("\\s+");
        names.set(Integer.parseInt(indexes[0]), Integer.parseInt(indexes[1]));

        names.print();
    }
}
