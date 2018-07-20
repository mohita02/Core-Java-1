import java.util.Scanner;

public class TargetPractice{
    public static void count(int target,int c,int s){
        Scanner in = new Scanner(System.in);
        int sum=s;
        int count=c;
        int t = target;
        System.out.println("Enter the scores taken by Patrick in each turn:");
        while(true){
            if(sum>=target){
                break;
            }
            int a = in.nextInt();
            sum+=a;
            count++;
        }
        if(sum>=target){
            System.out.println("The number of counts is " + count);
        }
        else{
            //count++;
            count(t,count,sum);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target score:");
        int t = sc.nextInt();
        count(t,0,0);
        sc.close();
    }
}