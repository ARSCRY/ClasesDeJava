/**
 * Dimensional
 */
public class Dimensional {

    public static void main(String[] args) {
        int [] [] arreglo = {{1,2,3,4},{5,6,7}};
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.println(arreglo[i][j]);
            }
        }

        //For-Each Loop
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}