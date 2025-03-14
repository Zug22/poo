//Nome: Allan Samuel Alves do Monte
//Matrícula: 24101279

import java.util.Scanner;

public class CollatzSequence {

    public static int nextCollatz(int n) {
        return (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
    }

    public static int calculateCollatzSum(int n) {
        int sum = 0;
        System.out.print("Sequência de Collatz: " + n);
        
        while (n != 1) {
            sum += n;
            n = nextCollatz(n);
            System.out.print(" → " + n);
        }

        sum += 1; // Adiciona o último termo da sequência (1)
        System.out.println(); // Pula linha após a sequência
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Digite um número inteiro positivo: ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                
                if (n > 0) {
                    break;
                }
            } else {
                scanner.next(); // Limpa a entrada inválida
            }
            
            System.out.println("Erro: O número deve ser um inteiro positivo.");
        }

        int soma = calculateCollatzSum(n);
        System.out.println("Soma dos termos: " + soma);

        scanner.close();
    }
}
