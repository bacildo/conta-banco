import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) throws Exception {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Número da conta " + numero);
        System.out.println("Número da agencia " + agencia);
        System.out.println("Nome do cliente " + nomeCliente);
        System.out.println("Saldo " + saldo);
    }
  }
}
