package panvalkar.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base and power");
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int pow = power(x, n);
        System.out.println("x^n = "+x+"^"+n+" = "+pow);
    }

    public static int power(int x, int n){
        if(x == 0){
            return 0;
        }else if (n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
}
