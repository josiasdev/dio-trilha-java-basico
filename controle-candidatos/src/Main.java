import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " idade é: " + idade);
    }
}