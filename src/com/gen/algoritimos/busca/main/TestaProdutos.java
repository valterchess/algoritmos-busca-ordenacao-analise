package com.gen.algoritimos.busca.main;

import com.gen.algoritimos.busca.modelos.Produtos;

public class TestaProdutos {
    public static void main(String[] args) {
        Produtos[] produtos = new Produtos[5];
        produtos[0] = new Produtos("Lamborghini", 1000000);
        produtos[1] = new Produtos("Jipe", 46000);
        produtos[2] = new Produtos("brasília", 16000);
        produtos[3] = new Produtos("Smart", 46000);
        produtos[4] = new Produtos("Fusca", 17000);
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
