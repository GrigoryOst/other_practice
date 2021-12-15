package Collections;

import java.util.Arrays;
import java.util.Collections;

public class Collects1 {

    public static void main(String[] args) {
        int [] a1 = new int[]{34, -45, 12, 67, -24, 24};
        System.out.println(Arrays.toString(a1));

        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        for (int i = 0, j = a1.length - 1; i < j; i++, j--) {
            int t = a1[i];
            a1[i] = a1[j];
            a1[j] = t;
        }
        System.out.println(Arrays.toString(a1));

        Integer[] a = new Integer[] {1, 2, 3};
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        String [] names = {"Zoe", "Allison", "Roman"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
