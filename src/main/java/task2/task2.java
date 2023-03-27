package task2;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 2) Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of your array :");
        int n = scanner.nextInt();
        int[] arr = createArr(n);
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Your array is ascending");
        } else {
            System.out.println("Your array is not ascending");
        }
    }
    private static int[] createArr(int n) {
        System.out.println("Input elements of your array :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scanner = new Scanner(System.in);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
