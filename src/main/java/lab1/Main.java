package lab1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private final static int RESTRICTION = 10;
    public static void main(String[] args) {
        int[][] array = enterMatrix();
        int arrayMax = discoverMax(array);
        int arrayMin = discoverMin(array);
        int arraySum = calculateSum(array);

        printMatrix(array);
        System.out.println("\nMax: " + arrayMax + "\nMin: " + arrayMin + "\nSum: " + arraySum);
    }

    private static int[][] enterMatrix() {
        Scanner in = new Scanner(System.in);
        while (true) {
            int m = enterRow(in);
            int n = enterCol(in);
            if (n != m) {
                int[][] arr = checkSize(m, n, in);
                in.close();
                return arr;
            } else {
                System.out.println("\nMust not be m = n \nTry again <3");
            }
        }
    }

    private static int enterRow(Scanner in) {
        int m = 0;
        boolean markWhileOne = true;
        while (markWhileOne) {
            System.out.print("Введите количество строк массива: ");
            m = in.nextInt();
            if (m > 0) {
                markWhileOne = false;
            } else {
                System.out.println("\nЧто-то пошло не так, m, n должны быть > 0\n");
            }
        }
        return m;
    }

    private static int enterCol(Scanner in) {
        int n = 0;
        boolean markWhileOne = true;
        while (markWhileOne) {
            System.out.print("Введите количество столбцов массива: ");
            n = in.nextInt();
            if (n > 0) {
                markWhileOne = false;
            } else {
                System.out.println("\nЧто-то пошло не так, m, n должны быть > 0\n");
            }
        }
        return n;
    }

    private static int[][] checkSize(int m, int n, Scanner in) {
        boolean markWhileTwo = true;
        int[][] arr = new int[m][n];
        int checkInput;
        while (markWhileTwo) {
            System.out.print("1 - ручной ввод, 2 - случайный ввод \nВведите тип заполнения массива: ");
            checkInput = in.nextInt();
            if (checkInput == 1) {
                findManual(arr, in);
                markWhileTwo = false;
            } else if (checkInput == 2) {
                findRandom(arr);
                markWhileTwo = false;
            } else {
                System.out.println("\nЧто-то пошло не так, введите 1 или 2\n");
            }
        }
        return arr;
    }

    private static void findManual(int[][] arr, Scanner in) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
    }

    private static void findRandom(int[][] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(RESTRICTION);
            }
        }
    }

    private static int discoverMax(int[][] arr) {
        int elemMax = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                {
                    if (arr[i][j] > elemMax) {
                        elemMax = arr[i][j];
                    }
                }
            }
        }
        return elemMax;
    }

    private static int discoverMin(int[][] arr) {
        int elemMin = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                {
                    if (arr[i][j] < elemMin) {
                        elemMin = arr[i][j];
                    }
                }
            }
        }
        return elemMin;
    }

    private static int calculateSum(int[][] arr) {
        int arrSum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                arrSum += anInt;
            }
        }
        return arrSum;
    }

    private static void printMatrix(int[][] arr) {
        System.out.println();
        System.out.println("Матрица имеет вид:");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}