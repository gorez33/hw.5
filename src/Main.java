import java.util.Random;
import java.util.Scanner;


public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        double[] doubleArr = new double[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = random.nextDouble(10);
            System.out.print(doubleArr[i] + " ");

        }
        System.out.println();

        Calculator calculator = new Calculator();
        calculator.startCalculations();

    }
}