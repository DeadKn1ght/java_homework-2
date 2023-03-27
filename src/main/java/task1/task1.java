//1) Дана последовательность N целых чисел.
// Найти сумму простых чисел.
package task1;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length to N = ");
        int n = scanner.nextInt();
        int[] arr = createArr(n);
        System.out.println(Arrays.toString(arr));
        sumPrimeNumbers(arr);
    }

    private static void sumPrimeNumbers(int[] arr) {
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] % (j + 1) == 0 && j != 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                sum += arr[i];
            }
        }
        System.out.println("Summ of all prime numbers in array is :");
        System.out.println(sum);
    }

    private static int[] createArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}

