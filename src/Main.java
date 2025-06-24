import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массив");
        int lenght = scanner.nextInt();
        double[] arrDouble = new double[lenght];

        for (int i = 0; i < arrDouble.length; i++) {
            arrDouble[i] = Math.random();
            System.out.println(arrDouble[i]);
            if (i % 2 == 1) {
                arrDouble[i] = Math.pow(arrDouble[i], 2);
            }
        }
        System.out.println();
        for (int i = arrDouble.length - 1; i >=0; i--) {
            System.out.println(arrDouble[i]);
        }
        double min = arrDouble[0];
        double max = arrDouble[0];
        for (double num : arrDouble) {
            if (num < min)
                min = num;
        }
        for( double num : arrDouble)
            if (num>max) {
                max = num;
            }
        System.out.println("максимальное число "  + max);
        System.out.println("минимальное число " + min);
                scanner.close();
        int minInd = 0;
        int maxInd = 0;
        for (int i = 1; i < arrDouble.length; i++) {
            if (arrDouble[i] < arrDouble[minInd]) {
                minInd = i;
            }
            if (arrDouble[i] > arrDouble[maxInd]) {
                maxInd = i;
            }
        }
        System.out.println("min:" + minInd);
        System.out.println("max:" + maxInd);
        }
    }


