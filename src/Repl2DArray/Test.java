package Repl2DArray;

public class Test {
    static int[][] reduce10(int[][] n) {
        int[][] red = new int[3][4];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.print(n[i][j] -= 10);
                red[i][j] = n[i][j];
            }
            System.out.println();
        }
        return red;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {4, 5, 6, 7}, {1, 3, 5, 7}};
        reduce10(a);
    }
}
