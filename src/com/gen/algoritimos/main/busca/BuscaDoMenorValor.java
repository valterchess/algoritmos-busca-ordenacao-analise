package com.gen.algoritimos.main.busca;

/**
 * O algoritmo faz duas buscas simples
 * para definir a posição e
 * o valor do carro mais barato no array
 */
public class BuscaDoMenorValor {
    public static void main(String[] args) {
        //definindo os valores a serem analisados
        double[] carros = {1000000, 49000,
                16000, 48000, 17000};
        double maisBarato = carros[0];
        //uma primeira abordagem: A variável recebe o valor
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] < maisBarato){
                maisBarato = carros[i];
            }
        }
        System.out.println("Valor do carro mais barato: " + maisBarato);
        maisBarato = 0;
        //outra abordagem: A variável recebe a posição
        for (int atual = 0; atual < carros.length;atual++){
            if (carros[atual] < carros[(int)maisBarato])
                maisBarato = atual;
        }
        System.out.println("posição do carro mais barato: " + maisBarato);
    }
}
