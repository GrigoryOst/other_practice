public class StaticBlock {


    // пример статического блока

    static double rootOf9;
    static double rootOf27;
    int number;

    public static void main(String[] args) {
        System.out.println("Корень из 9 = " + StaticBlock.rootOf9);
        System.out.println("Корень из 27 = " + StaticBlock.rootOf27);

        StaticBlock sb1 = new StaticBlock(4);
        System.out.println("sb1 = " + sb1.number);

        StaticBlock sb2 = new StaticBlock(16);
        System.out.println("sb1 = " + sb2.number);
    }

    static {
        System.out.println("Иниц статич членов класса...");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }

    StaticBlock (int number) {
        System.out.println("иниц перемен экземпляра класса...");
        this.number = number;
    }
}
