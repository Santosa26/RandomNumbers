package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorNumeros {
    
    private int quantidade;
    private int limiteSuperior;
    private List<Integer> numeros;

    public GeradorNumeros(int quantidade, int limiteSuperior) {
        this.quantidade = quantidade;
        this.limiteSuperior = limiteSuperior;
        this.numeros = new ArrayList<>();
    }

    public void gerarNumeros() {
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            int numero = random.nextInt(limiteSuperior + 1); // limiteSuperior + 1 para incluir o limite no intervalo
            numeros.add(numero);
        }
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}