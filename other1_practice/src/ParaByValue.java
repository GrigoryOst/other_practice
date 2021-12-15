public class ParaByValue {
    int x, y;

    ParaByValue(int x, int y) {// передача параметров по ссылке
        this.x = x;
        this.y = y;
    }

    void callByVal(ParaByValue o) {// передача параметров по ссылке
        o.x = o.x + this.x;
        o.y = o.y + this.y;
    }

    /*void callByVal(int x, int y) {  // передача параметров по значению
        x = x + y;
        y = y + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }*/

    public static void main(String[] args) {
        ParaByValue p = new ParaByValue(2, 3); // передача параметров по ссылке
        ParaByValue q = new ParaByValue(3, 2);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

        p.callByVal(q);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

        /*int a = 2; // передача параметров по значению
        int b = 3;

        ParaByValue test = new ParaByValue();
        test.callByVal(a,b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);*/

    }

}
