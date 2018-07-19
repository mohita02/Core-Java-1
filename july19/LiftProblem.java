import java.lang.Math.*;
import java.util.Scanner;

public class LiftProblem{
    public static void floor(int n,int n1,int n2,int n3){
        int ans1 = n-n1;
        int ans2 = n-n2;
        int ans3 = n-n3;
        if(java.lang.Math.abs(ans1)<java.lang.Math.abs(ans2) && java.lang.Math.abs(ans1)<java.lang.Math.abs(ans3)){
            System.out.println(n1);
        }
        if(java.lang.Math.abs(ans2)<java.lang.Math.abs(ans1) && java.lang.Math.abs(ans2)<java.lang.Math.abs(ans3)){
            System.out.println(n2);
        }
        if(java.lang.Math.abs(ans3)<java.lang.Math.abs(ans2) && java.lang.Math.abs(ans3)<java.lang.Math.abs(ans1)){
            System.out.println(n3);
        }
        // if(java.lang.Math.abs(ans1)<java.lang.Math.abs(ans2) && java.lang.Math.abs(ans1)<java.lang.Math.abs(ans3)){
        //     System.out.println(ans1);
        // }
        if(java.lang.Math.abs(ans1)==java.lang.Math.abs(ans2)){
            System.out.println(n2);
        }
        else if(java.lang.Math.abs(ans2)==java.lang.Math.abs(ans3)){
            System.out.println(n3);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        floor(n, n1, n2, n3);
        sc.close();
    }
}