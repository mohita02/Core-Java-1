import java.util.*;

class countHoles{
    public static int holesInNumbers(int n){
        int rem = 0;
        int res = 0;
        int a = n;
        while(n!=0){
            rem = n%10;
            switch(rem){
                case 1:
                    res+=0;
                    break;
                case 2:
                    res+=0;
                    break;
                case 3:
                    res+=0;
                    break;
                case 4:
                    res+=1;
                    break;
                case 5:
                    res+=0;
                    break;
                case 6:
                    res+=1;
                    break;
                case 7:
                    res+=0;
                    break;
                case 8:
                    res+=2;
                    break;
                case 9:
                    res+=1;
                    break;
                default:
                    res+=1;
            }
            n/=10;   
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number of holes in " + num + " are " + holesInNumbers(num));
    }
}