package Topics.Other.destCity;

import Utils.Methods.Methods;

public class test {
    public static void main(String[] args) {
        System.out.println(new Solution().destCity2(
        Methods.toArrayList(
                new String[][]{{"London","New York"}, {"New York","Lima"}, {"Lima","Sao Paulo"}})
        ));
        System.out.println(new Solution().destCity(
                Methods.toArrayList(
                        new String[][]{{"London","New York"}, {"New York","Lima"}, {"Lima","Sao Paulo"}})
        ));
    }
}
