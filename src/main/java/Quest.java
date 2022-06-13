import java.util.Arrays;

public class Quest {
    public static void main(String[] args) {
        swop(null,-9,-8);
        Integer[] y = {1 , 2 ,3};
        System.out.println(Arrays.toString(y));
        swop(y,0,2);
        System.out.println(Arrays.toString(y));

        String[] s = {"волчонок", "оборотень"};
        System.out.println(Arrays.toString(s));
        swop(s,0,1);
        System.out.println(Arrays.toString(s));
    }

    public static void swop(Object[] array, int a, int n) {
        if (array != null && array.length > a && array.length > n && a >= 0 && n >= 0) {
            Object o = array[a];
            array[a] = array[n];
            array[n] = o;
        }

    }
}
