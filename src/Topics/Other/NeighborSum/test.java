package Topics.Other.NeighborSum;

public class test {
    public static void main(String[] args) {
        NeighborSum n1 = new NeighborSum(new int[][]{
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
        });
        System.out.println(n1.adjacentSum(1));
        System.out.println(n1.adjacentSum(4));
        System.out.println(n1.diagonalSum(4));
        System.out.println(n1.diagonalSum(8));
        System.out.println();
        NeighborSum n2 = new NeighborSum(new int[][]{
                {1, 2, 0, 3},
                {4, 7, 15, 6},
                {8, 9, 10, 11},
                {12, 13, 14, 5},
        });
        System.out.println(n2.adjacentSum(15));
        System.out.println(n2.diagonalSum(9));
    }
}
