import java.util.Scanner;
/**
 * Desenvolva um gerador de tabuada
 */
public class TabuadaEsboco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabuada = sc.nextInt();

        System.out.println("Tabuada do número: " + tabuada);

        for(int i = 1; i <= 10; i++ ) {
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
        }
    }
}