import java.util.Scanner;

class ArrayDemo{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}