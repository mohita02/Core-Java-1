import java.util.Scanner;

class divide{  
    int size;
    int position;
    int a[];
    Scanner sc = new Scanner(System.in); 
    divide(int p,int s){
        position = p;
        size = s;
        a = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
    }
    void splitArray(){
        for(int i=0;i<position;i++){
            for(int j=0;j<position-i-1;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=position;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    void printArray(){
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class sortArray{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter the size of array : ");
      int n = sc.nextInt();
      System.out.println("Enter the positon to divide array : ");
      int pos = sc.nextInt();
      divide d = new divide(pos,n);
      d.splitArray();
      d.printArray();
      sc.close();
    }
}