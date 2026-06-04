package com.bod5;

public class Ascii {
    private final int value;
    public Ascii(int value){
        this.value = value;
    }
    public char getChar(){
        char c = (char) this.value;
        return c;
    }
}
