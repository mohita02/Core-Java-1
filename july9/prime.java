/*
* A simple program to find out the nth prime number.
*/

import java.util.Scanner;

public class prime{
    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<=n;i+=2){
            if(isPrime(i)){
                count++;
            }
        }        
        System.out.println("Prime no. is : " + n-2);
        sc.close();
    }
}