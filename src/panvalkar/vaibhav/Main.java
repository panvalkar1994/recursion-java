package panvalkar.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
        }
        int maxVal = maxValue(arr,0);
        System.out.println(maxVal);
    }

    public static int maxValue(int[] arr, int start){
        if (start==arr.length-1) return arr[start];
        int mxRest = maxValue(arr, start+1);
        return Math.max(mxRest,arr[0]);
    }
}
