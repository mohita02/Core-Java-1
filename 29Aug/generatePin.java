import java.util.*;

class generatePin{
    public static int least(int a,int b,int c){
        int l=0;
        if(a>b){
            if(b>c){
                l=c;
            }
            else{
                l=b;
            }
        }
        else{
            l=a;
        }
        return l;
    }
    public static int greatest(int a,int b,int c){
        int h=0;
        if(a>b && a>c){
            h=a;
        }
        else if(b>a && b>c){
            h=b;
        }
        else{
            h=c;
        }
        return h;
    }
    public static int great(int n){
        int h=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            if(rem>h){
                h=rem;
            }
            n/=10;
        }
        return h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 inputs : ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        String pin="";
        int a = great(input1);
        int b = great(input2);
        int c = great(input3);
        while(input1!=0){
            int rem1 = input1%10;
            int rem2 = input2%10;
            int rem3 = input3%10; 
            int res = least(rem1, rem2, rem3);
            Integer.toString(res);
            pin+=res;
            input1/=10;
            input2/=10;
            input3/=10;
        }
        StringBuffer m = new StringBuffer(pin);
        int ans = greatest(a, b, c);
        System.out.println("Your pin is " + ans + m.reverse());
    }
}