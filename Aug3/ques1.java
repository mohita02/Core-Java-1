import java.util.Scanner;

class Palindrome{
    int rev;
    int rem;
    int a;
    int i;
    int[] arr = new int[20];
    Palindrome(){
        rev=0;
        rem=0;
        a=0;
        i=0;
    }
    void reverse(int n){
        a = n;
        rev=0;
        rem=0;
        while(n!=0){
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        check();
    }
    void check(){
        if(a==rev){
            arr[i] = a;
            //System.out.println(a);
            i++;
        }
        else{
            int s = a;
            //System.out.println("Not a Palindrome");
            s++;
            reverse(s);
        }
    }
    void display(){
        for(int j=0;j<20;j++){
            if(arr[j]>0){
                System.out.println(arr[j]);
            }
        }
    }

}
public class ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Palindrome p = new Palindrome();
        int[] ar = new int[t];
        for(int i=0;i<t;i++){
            int s = sc.nextInt();
            ar[i]=s;
        }
        for(int i=0;i<t;i++){
            ar[i]++;
           p.reverse(ar[i]);
        }
        p.display();
    }
}