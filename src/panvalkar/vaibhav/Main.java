package panvalkar.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        toh(3, "A", "B", "C");
    }

    public static void toh(int n, String start, String end, String helper){
        if (n==0){
            return;
        }
        toh(n-1, start, helper, end);
        System.out.println(n+""+start+"->"+end);
        toh(n-1,helper, end, start);
    }
}
