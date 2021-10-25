package com.gen.algoritimos.main.busca;

import com.gen.algoritimos.modelos.Produto;

public class TestaMenorPreco {
    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        int maisBarato = buscaMenor(produtos, 0, produtos.length);
        System.out.println(maisBarato);
        System.out.printf("O carro %s é o mais barato, e custa %.2f",
                produtos[maisBarato].getNome(),
                produtos[maisBarato].getPreco());
    }
    private static int buscaMenor(Produto[] produtos, int inicio, int termino) throws  ArrayIndexOutOfBoundsException{
        int maisBarato = inicio;
         for (int i = inicio; i < termino; i++) {
            if (produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = i;
            }
        }
        return maisBarato;
    }
}
