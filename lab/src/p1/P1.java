package p1;

public class P1 {
    public int p1_pub;
    private int pl_pri;
    protected int pl_pro;
    int pl_def;
}

class P1_Sub extends P1 {
    P1_Sub() {
        super.p1_pub = 5;
        super.pl_pro = 5;
        super.pl_def = 5;
        super.pl_pri = 5;
    }
}

class P1_Test {
    P1_Test() {
        P1 p1 = new P1();
        p1.p1_pub = 5;
        p1.pl_pro = 5;
        p1.pl_def = 5;
        p1.pl_pri = 5;
    }
}
