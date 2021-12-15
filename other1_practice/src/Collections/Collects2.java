package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collects2 {

    public static void main(String[] args) {
        String [] planets1 = new String[] {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(planets1));
        Collections.sort(solarSystem1);
        System.out.println(solarSystem1);
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,45,252,1,89,0));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println();

        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i) + " ");
        }


        String [] planets2 = new String[] {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        List<String> solarSystem2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(planets2)));
        System.out.println();
        try {
            solarSystem2.add("pluto");
        } catch (UnsupportedOperationException e) {
            System.out.println("WRONG");
        }


    }

}
