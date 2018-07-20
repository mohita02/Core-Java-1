import java.util.Scanner;

public class CardGame{
    public static void predict(int n){
        int a = n;
        int sumE = 0;
        int sumO = 0;
        while(a!=0){
            if((a%10)%2==0){
                sumE+=(a%10);
            }else{
                sumO+=(a%10);
            }
            a/=10;
        }
        if(sumE==sumO){
            System.out.println("Johnny will win the Card Game");
        }else{
            System.out.println("Johnny will not win the Card Game");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the card picked up by Johnny : ");
        int num = sc.nextInt();
        predict(num);
        sc.close();
    }
}