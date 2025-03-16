import java.util.Scanner;

public class FortalecerSenha {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.next();
        scanner.close();
        
        String senhaFortalecida = fortalecerSenha(senha);
        System.out.println("Senha fortalecida: " + senhaFortalecida);
    }
    
    public static String fortalecerSenha(String s) {
        String melhorSenha = "";
        int maiorTempo = 0;
        
        for (int i = 0; i <= s.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String novaSenha = s.substring(0, i) + c + s.substring(i);
                int tempo = calcularTempoDigitacao(novaSenha);
                
                if (tempo > maiorTempo) {
                    maiorTempo = tempo;
                    melhorSenha = novaSenha;
                }
            }
        }
        return melhorSenha;
    }
    
    public static int calcularTempoDigitacao(String senha) {
        int tempo = 2; // O primeiro caractere leva 2 segundos
        
        for (int i = 1; i < senha.length(); i++) {
            if (senha.charAt(i) == senha.charAt(i - 1)) {
                tempo += 1;
            } else {
                tempo += 2;
            }
        }
        return tempo;
    }
}
