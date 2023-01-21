import java.util.Scanner;
/**
 *  crie um programa que com as entradas do seu sobrinho,
 *  e calcule automaticamente a quantidade de dinheiro que ele terá em X meses.
 */
public class Mesada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        int total = mesada * entrada;

        System.out.println(total);
    }
}
