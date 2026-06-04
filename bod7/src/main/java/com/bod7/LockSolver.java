package com.bod7;

public class LockSolver {
    private final int buttons;
    public LockSolver(int buttons){
        this.buttons = buttons;
    }
    public int WorstCase(){
        int sum = buttons;
        for (int i=1; i< buttons; i++){
            sum = sum + i*(buttons-i);
        }
        return sum;
    }
}