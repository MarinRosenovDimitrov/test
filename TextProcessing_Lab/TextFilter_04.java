package TextProcessing_Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : banWords) {
            if (text.contains(word)){
                String ban = getBanWord("*", word.length());
                text = text.replace(word, ban);
            }
        }
        System.out.println(text);
    }

    private static String getBanWord(String word, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(word).repeat(Math.max(0, count)));
        return stringBuilder.toString();
    }
}
