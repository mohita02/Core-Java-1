import java.util.InputMismatchException;
import java.util.Scanner;

public class GiftProblem{
    public static void check(String[] s, String ch, int n){
        int flag=0;
        for(int i=0;i<n;i++){
            if(String.valueOf(s[i].charAt(0))==ch){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Yes");   
        }
        else{
            System.out.println("No");
        }

    }
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextLine();
        }
        String c = sc.next();
        check(arr, c, size);
        sc.close();
    }
}