package com.gen.algoritimos.main.busca;

import com.gen.algoritimos.modelos.Produto;

public class TestaProdutos {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Produto("Lamborghini", 1000000);
        produtos[1] = new Produto("Jipe", 46000);
        produtos[2] = new Produto("brasília", 16000);
        produtos[3] = new Produto("Smart", 46000);
        produtos[4] = new Produto("Fusca", 17000);
        int maisBarato = 0;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = i;
            }
        }
        System.out.println(maisBarato);
        System.out.println("O carro: "  + produtos[maisBarato].getNome()
                + "é o mais barato e custa : "
                + produtos[maisBarato].getPreco());
    }
}
