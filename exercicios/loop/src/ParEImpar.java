import java.util.Scanner;
/**
 * faça um programa que leia N números inteiros
 * mostre a quantidade de números ímpares e pares
 */

public class ParEImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;

        int quantPares = 0;
        int quantimpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantimpares++;

            contador += 1;

        } while (contador < quantNumeros);

        System.out.println("Quantidade pares : " + quantPares);
        System.out.println("Quantidade ímpares :" + quantimpares);
    }
}