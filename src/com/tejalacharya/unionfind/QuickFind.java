package com.tejalacharya.unionfind;

/**
 * Created by I826128 on 6/19/2015.
 */
public class QuickFind {
    private int[] id;

    public QuickFind(int n){
        id = new int[n];
        for(int i=0; i<n;i++){
            id[i] = i;
        }
    }

    public boolean connected (int p,int q){
        return id[p] == id [q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i=0; i<id.length;i++){
            if(id[i] == pid) id[i] = qid;
        }
    }
}
