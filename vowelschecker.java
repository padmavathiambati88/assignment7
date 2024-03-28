import java.util.*;
public class vowelschecker {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); 
        int vowelCount = 0;
        boolean isVowelPresent = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                isVowelPresent = true;
                vowelCount++;
            }
        }
        if (isVowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }
    }
}