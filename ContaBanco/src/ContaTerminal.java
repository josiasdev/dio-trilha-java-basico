import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do Cliente");
        String nome = scanner.next();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência da conta");
        String agencia = scanner.next();

        System.out.println("Digite o saldo da conta");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
