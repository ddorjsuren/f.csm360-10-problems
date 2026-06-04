package com.bod3;

public class ArithmeticProgress {
    private final int p;
    private final int ap;
    private final int q;
    private final int aq;
    private final int n;
    public ArithmeticProgress(int p, int ap, int q, int aq, int n) {
        this.p = p;
        this.ap = ap;
        this.q = q;
        this.aq = aq;
        this.n = n;
    }
    private int calculateD() {
        return (aq - ap) / (q - p);
    }
    public int getAn() {
        return p + (n - p) * calculateD();
    }
}
