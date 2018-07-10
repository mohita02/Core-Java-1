import java.util.Scanner;

class MinMax{
    static Scanner sc = new Scanner(System.in);
    public static void sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sortArray(a);
        System.out.println("The Maximum element is " + a[a.length-1]);
        System.out.println("The Minimum element is " + a[0]);
    }
}