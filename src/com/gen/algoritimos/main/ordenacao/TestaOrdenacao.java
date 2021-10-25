package com.gen.algoritimos.main.ordenacao;

import com.gen.algoritimos.modelos.Produto;

/**
 * Quando as coisas estão ordenadas,
 * o processo de busca se torna mais rápido.
 * Essa é a grande sacada da ordenação:
 * ela permite-nos resolver tarefas do cotidiano
 * quase imediatamente.
 */
public class TestaOrdenacao {
    public static void main(String[] args) {
        //criando e populando o Array
        Produto[] produtos = {
         new Produto("Lamborghini", 1000000),
         new Produto("Jipe", 46000),
         new Produto("brasília", 16000),
         new Produto("Smart", 46000),
         new Produto("Fusca", 17000)
        };

        ordena(produtos, produtos.length);

        for (Produto produto: produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
    }

    /**
     * Recebe um array e duas posições, uma de início e outra de término,
     * verifica qual produto tem o menor preço e retorna a posição deste produto no array
     */
    private static int buscaMenor(Produto[] produtos, int inicio, int termino) throws  ArrayIndexOutOfBoundsException{
        int maisBarato = inicio;
        for (int i = inicio; i < termino; i++) {
            if (produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = i;
            }
        }
        return maisBarato;
    }
    private static void ordena(Produto[] produtos, int qtdElementos){
        //ordenando o array do menor para o maior
        for(int i = 0; i < qtdElementos;i++){
            int menor = buscaMenor(produtos,i,qtdElementos);
            Produto produtosAtual = produtos[i];
            Produto produtosMenor = produtos[menor];
            produtos[i] = produtosMenor;
            produtos[menor] = produtosAtual;
        }
    }
}
