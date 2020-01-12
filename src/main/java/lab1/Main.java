package lab1;

public class Main {

    public static void main(String[] args) {
        MatrixCreator matrixCreator = new MatrixCreator();
        int[][] array = matrixCreator.enterMatrix();
        int arrayMax = matrixCreator.discoverMax(array);
        int arrayMin = matrixCreator.discoverMin(array);
        int arraySum = matrixCreator.calculateSum(array);

        matrixCreator.printMatrix(array);
        System.out.println("\nMax: " + arrayMax + "\nMin: " + arrayMin + "\nSum: " + arraySum);
    }


}