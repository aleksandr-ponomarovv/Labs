package lab1;

import java.util.Random;
import java.util.Scanner;

public class LabStart1 {
    public static void main(String[] args) {
        work();
    }

    public static void work() {
        int[][] array = enterMatrix();
        int[] arrayMaxMin = discoverMaxMin(array);
        int arraySum = countSum(array);

        printMatrix(array);
        System.out.println("\nMax: " + arrayMaxMin[0] + "\nMin: " + arrayMaxMin[1]);
        System.out.println("Sum: " + arraySum);
    }

    public static int[][] enterMatrix() {
        Scanner in = new Scanner(System.in);
        while (true){
            int m = findRow(in);
            int n = findCol(in);
            if (checkEqual(m, n)){
                int[][] arr = checkSize(m, n, in);
                in.close();
                return arr;
            }
            else {
                System.out.println("\nMust not be m = n \nTry again <3");
            }
        }
    }

    public static boolean checkEqual(int m, int n) {
        boolean eq;
        if (m == n) {
            eq = false;
        } else {
            eq = true;
        }
        return eq;
    }

    public static int findRow(Scanner in) {
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

    public static int findCol(Scanner in) {
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

    public static int[][] checkSize(int m, int n, Scanner in) {
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

    public static void findManual(int[][] arr, Scanner in) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
    }

    public static void findRandom(int[][] arr) {
        Random random = new Random();
        int restriction = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(restriction);
            }
        }
    }

    public static int[] discoverMaxMin(int[][] arr) {
        int elemMax = arr[0][0];
        int elemMin = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                {
                    if (arr[i][j] > elemMax) {
                        elemMax = arr[i][j];
                    } else if (arr[i][j] < elemMin) {
                        elemMin = arr[i][j];
                    }
                }
            }
        }
        int[] arrMaxMin = new int[2];
        arrMaxMin[0] = elemMax;
        arrMaxMin[1] = elemMin;
        return arrMaxMin;
    }

    public static int countSum(int[][] arr) {
        int arrSum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                arrSum += anInt;
            }
        }
        return arrSum;
    }

    public static void printMatrix(int[][] arr) {
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



