import java.util.Locale;
import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = sc.nextLine();
        nome=nome.toUpperCase();
        String[] nomeSeparado = nome.split(" ");
        System.out.println(nomeSeparado[(nomeSeparado.length - 1)] + " " + nomeSeparado[0].substring(0,1));
    }
}
