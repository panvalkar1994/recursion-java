package panvalkar.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn  =  new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int n  = scn.nextInt();
        int fact = factorial(n);
        System.out.println("factorial of "+n+" is "+fact);
    }

    public  static  int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
