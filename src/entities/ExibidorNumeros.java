package entities;

import java.util.List;

public class ExibidorNumeros {
    private List<Integer> numeros;

    public ExibidorNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void exibirNumeros() {

        System.out.println("Números gerados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
    
}