package TextProcessing_Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")){
            printReverseString(input);
            input = scanner.nextLine();
        }
    }

    private static void printReverseString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char symbol = input.charAt(i);
            sb.append(symbol);
        }
        System.out.println(input + " = " + sb);
    }
}
