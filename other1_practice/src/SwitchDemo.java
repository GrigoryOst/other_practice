public class SwitchDemo {
    /*При каждом проходе цикла значение переменной х сравнивается
    * с константами, перечиленными после ключевых слов case.
    * Как только обнаружено совпадение, начинают выполняться команды, стоящие после
    * найденной константы, вплоть до первой команды break или , если
    * команда break нет, до конца оператора switch.*/
    public static void main(String[] args) {
        for (int x = 1; x <= 13; x++) {
            switch (x) {
                case 1: case 2: case 12:
                    System.out.println(x + ": winter");
                    break;
                case 3: case 4: case 5:
                    System.out.println(x + ": spring");
                    break;
                case 6: case 7: case 8:
                    System.out.println(x + ": summer");
                    break;
                case 9: case 10: case 11:
                    System.out.println(x + ": autumn");
                    break;
                default:
                    System.out.println(x + ": error");
            }
        }
    }
}
