import java.util.Scanner;

public class ForEach{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemnts of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are : ");
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}