/*
* Q. Tell the count of every element without sorting.
*/
import java.util.Scanner;
class Count{
    

}
public class frequencyOfNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Count c = new Count(a,n);
        sc.close();
    }
}