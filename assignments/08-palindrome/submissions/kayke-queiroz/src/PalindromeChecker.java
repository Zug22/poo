import java.util.Scanner;

public class PalindromeChecker {
    
    public static boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
    
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Digite uma sequência: ");
            input = scanner.nextLine();
            
            if (!isValidInput(input)) {
                System.out.println("Erro: A entrada não pode estar vazia.");
                continue;
            }
            
            if (isPalindrome(input)) {
                System.out.println("A sequência \"" + input + "\" é um palíndromo.");
            } else {
                System.out.println("A sequência \"" + input + "\" não é um palíndromo.");
            }
            break;
        }
        
        scanner.close();
    }
}
