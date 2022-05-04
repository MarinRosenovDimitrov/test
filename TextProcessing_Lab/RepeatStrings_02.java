package TextProcessing_Lab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        printRepeatString(strings);
    }

    private static void printRepeatString(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                stringBuilder.append(strings[i]);
            }
        }
        System.out.println(stringBuilder);
    }
}
