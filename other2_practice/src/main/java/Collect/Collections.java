package Collect;

import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        //создание множества
        Set great = new HashSet();
        //добавление элемента
        great.add("Ivan");
        great.add("Stepan");
        great.add("Boris");
        //удаление элемента
        great.remove("Ivan");
        //определение размера
        int value = great.size();
        System.out.println(value);
        //проверка наличия  определенного элемента
        boolean resultb = great.contains("Stepan");
        System.out.println(resultb);
    }
}
