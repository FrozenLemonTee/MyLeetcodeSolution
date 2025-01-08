package Utils.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static Integer[] toArray(int[] array) {
        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static Double[] toArray(double[] array) {
        Double[] arr = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static Boolean[] toArray(boolean[] array) {
        Boolean[] arr = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static Character[] toArray(char[] array) {
        Character[] arr = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static <T> List<T> toArrayList(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T> List<List<T>> toArrayList(T[][] array) {
        List<List<T>> nestedList = new ArrayList<>();
        for (T[] row : array) {
            nestedList.add(toArrayList(row));
        }
        return nestedList;
    }
}
