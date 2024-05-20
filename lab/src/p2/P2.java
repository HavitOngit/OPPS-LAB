package p2;

import p1.*;

public class P2 {

    P2() {
        P1 p1 = new P1();

        p1.p1_pub = 5;

        p1.pl_pro = 5;

        p1.pl_def = 5;

        p1.pl_pri = 5;
    }
}

class P2_SubP1 extends P1 {

    P2_SubP1() {
        super.p1_pub = 5;
        super.pl_pro = 5;
        super.pl_def = 5;
        super.pl_pri = 5;
    }
}

class P2_SubP2 extends P2_SubP1 {

    P2_SubP2() {
        p1_pub = 5;
        pl_pro = 5;
        p1_def = 5;
        p1_pri = 5;
    }
}
