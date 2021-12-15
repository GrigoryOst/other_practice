public class Ternary {

    //condition1 ? condition2 : condition3
    //if condition1 = true then condition2
    //if condition1 = false then condition3

    public static void main(String[] args) {
        for (int number = -5; number <= 5; number++) {
            int absval = number < 0 ? -number : number;
            System.out.println("Absolut value = " + absval);
        }
    }

}
