package com.bod6;

public class OddSum {
    private final int n;

    public OddSum(int n){
        this.n = n;
    }
    
    public int getSum(){
        return (n+1)*(n+1)/4;
    }
}