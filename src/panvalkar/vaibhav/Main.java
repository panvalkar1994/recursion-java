package panvalkar.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        System.out.println("Enter Target value");
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            int x = scanner.nextInt();
            arr[i]=x;
        }
        int first = firstOccurrence(arr, 0, target);
        System.out.println("first occurrence of "+target+" is at "+first);
    }

    public static int firstOccurrence(int[] arr, int idx, int target){
        if (idx == arr.length -1){
            return -1;
        }
        if (arr[idx]==target) return idx;
        return firstOccurrence(arr, idx+1, target);
    }
}
