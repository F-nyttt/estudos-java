import java.util.Scanner;
/**
 * Você foi contratado para criar um gerenciador de pacotes.
 * O que restou para você fazer foi o contador de porcentagem de download dos pacotes.
 * Mas como o espaço para essa informação ficou pequeno, a empresa optou fazer uma escala de 10 – 1.
 * Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
 * Para cada 10% de download, o programa deve printar, em sequência, uma barra “/”.
 */

public class Pacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();


        for (int i = 1; i <= tamanho; i++) {
            System.out.print("/");
        }

        // Crie condição para que, de acordo com o tamanho, seja printado no console barras representando o download

    }
}