
import java.util.Locale;
import java.util.Scanner;


public class AbouMe {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Olá, me chamo " + nome + " " + sobrenome + ", ");

        System.out.print("tenho " + idade + " anos ");
        
        System.err.println("minha altura é " + altura + "cm");

    }
}