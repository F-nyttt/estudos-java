import java.util.Scanner;

public class ExercicioNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente: ");
            nota = sc.nextInt();
        }



    }
}