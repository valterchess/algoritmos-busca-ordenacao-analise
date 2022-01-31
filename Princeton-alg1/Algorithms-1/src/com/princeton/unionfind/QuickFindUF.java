package com.princeton.unionfind;


public class QuickFindUF {
	
	private int[] id;
	
	
	//Constroe o array com tamanho N 
	//e adiciona os valores de 0 a N 
	// em suas respectivas posições no array
	public QuickFindUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i ++) 
			id[i] = i;
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++)
			if (id[i] == pid) id[i] = qid;
	}
	
	public int getNode(int p) {
		return id[p];
	}
	
}
