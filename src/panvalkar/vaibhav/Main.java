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
        if(n==0){
            return 1;
        }
        int  p = power(x, n/2);
        if((n & 1)==1){
            return p*p*x;
        }
        return p*p;
    }
}
