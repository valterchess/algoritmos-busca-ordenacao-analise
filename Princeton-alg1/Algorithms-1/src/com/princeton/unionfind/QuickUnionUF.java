/**
 * A estrutura de dados é a mesma, porém, 
 * essa classe permite uma organização melhor e mais complexa dos
 * conjuntos. Onde ao ser aplicado o método de união, dentre os valores recebidos
 * o valor q se torna um valor raiz de p, onde qualquer valor relacionado ao valor p
 * terá como raiz o valor de p, e terá como Pai o valor q, que foi implementado conjuntamente 
 * na aplicação do método. Se colocarmos dois elementos de conjuntos diferentes, ainda que tais elementos não
 * sejam o elemento raiz, toda o conjunto de q vai ser conectado ao conjunto de p, tendo como raiz a raiz de p.
 */

package com.princeton.unionfind;

public class QuickUnionUF {
	
	private int[] id;
	
	public QuickUnionUF(int N) {
		id = new int [N];
		for (int i = 0; i < N; i++)
			id[i] = i; 
	}
	
	private int root(int i) {
		while (i != id[i]) i = id[i];
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union (int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}

}
