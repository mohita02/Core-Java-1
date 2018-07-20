import java.util.Scanner;

public class Palindrome{
    public static void palindrome(int num,int c){
        int rev=0;
        int rem=0;
        int d;
        d = num;
        //System.out.println(num);
        int count=c;
        while(d!=0){
            rem = d%10;
            rev = rem + rev*10;
            d=d/10;
        }
        //System.out.println(d);
        if(rev==num){
            System.out.println("Number of steps = " + count);
        }
        else{
            int n = rev+num;
            count++;
            palindrome(n,count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c = 0;
        palindrome(n,c);
    }
}