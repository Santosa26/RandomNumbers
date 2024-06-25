package application;

import java.util.Scanner;
import entities.GeradorNumeros;
import entities.ExibidorNumeros;

public class Program {
    public static void main(String [] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você quer gerar?");
        int quantidade = scanner.nextInt();

        System.out.println("Qual é o limite superior para os números gerados?");
        int limiteSuperior = scanner.nextInt();

        GeradorNumeros gerador = new GeradorNumeros(quantidade, limiteSuperior);
        gerador.gerarNumeros();

        ExibidorNumeros exibidor = new ExibidorNumeros(gerador.getNumeros());
        exibidor.exibirNumeros();

        scanner.close();

    }
}
