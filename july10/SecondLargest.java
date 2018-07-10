import java.util.Scanner;

class SecondLargest{
    static Scanner sc = new Scanner(System.in);
    public static void secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax){
                smax = arr[i];
            }
        }
        System.out.println("The Second largest element is " + smax);
    }
    public static void secondMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                smin = min;
                min = arr[i];
            }
            else if(arr[i]<smin){
                smin = arr[i];
            }
        }
        System.out.println("The Second minimum element is " + smin);
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        secondLargest(a);
        secondMin(a);
    }
}