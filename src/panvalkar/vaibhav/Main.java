package panvalkar.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = scanner.nextInt();
        System.out.println("Enter Target value");
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
        }
        int lastOccurrence = findLastOccurrence(arr,0,d);
        System.out.println("Last occurrence in arr is at index: "+lastOccurrence);
    }

    public static int findLastOccurrence(int[] arr, int start, int val){
        if (arr.length == start){
            return -1;
        }
        int lastIdx = findLastOccurrence(arr, start+1, val);
        if (lastIdx==-1){
            if (arr[start]==val){
                return start;
            }else{
                return -1;
            }
        }else{
            return lastIdx;
        }
    }
}
