package panvalkar.vaibhav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        System.out.println("Enter Array values: ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            int x = scanner.nextInt();
            arr[i] = x;
        }
        System.out.println("Printing array");
        System.out.println(Arrays.toString(arr));
    }
}
