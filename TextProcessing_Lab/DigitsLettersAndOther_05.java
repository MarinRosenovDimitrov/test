package TextProcessing_Lab;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (Character symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)){
                numbers.append(symbol);
            }else if (Character.isLetter(symbol)){
                letters.append(symbol);
            }else {
                others.append(symbol);
            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(others);
    }
}
