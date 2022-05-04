package TextProcessing_Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removedWord = scanner.nextLine();
        String word = scanner.nextLine();
        int index = word.indexOf(removedWord);
        while (index != -1){
           word = word.replace(removedWord,"");
           index = word.indexOf(removedWord);
        }
        System.out.println(word);
    }
}
