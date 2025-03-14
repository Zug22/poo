import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();
            System.out.printf("String invertida: %s\n", reverse(input));

       }
    }

    public static String reverse(String inputString) {

        if (inputString == null) {
            throw new IllegalArgumentException("A string não pode ser nula.");
        }

        StringBuilder reversedString = new StringBuilder();
  
        for (int i = inputString.length()-1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }
        
        return reversedString.toString();
 
    }
}