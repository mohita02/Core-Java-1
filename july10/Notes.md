# JULY 10, Tuesday

|Data type|Size/ No. of bytes|
|---------|------------------|
|byte|1|
|short|2|
|int|4|
|long|8|
|float|4|
|double|8|
|char|2|
|boolean|1|

**Type Conversion** : There are 2 types of conversions in Java.
1. *Widening Conversion (Automatic)* : In this if the left size has a bigger data type and right side has a smaller one, the smaller is converted into the bigger one

```
int a;
int b;
a=b;
```
2. *Narrowing Conversion (Explicit)* : In this we explicitly convert the data type we want to.
```
float f;
double d;
f = (float) d;
```

**Array**

1.  type arrayName[];
    arrayName = new type[size];
2.  type arrayName[] = new type[size];

```
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
```

**Jagged Array** : A jagged array is array of arrays such that member arrays can be of different sizes i.e we can create a 2-D array but with variable number of columns in each row.
The following code demonstrates the above concept :
```
class Main{
    public static void main(String[] args){
        
        int arr[][] = new int[3][] //Declaring a 2-D array

        arr[0] = new int[1]; //The first row has 1 column
        
        arr[1] = new int[2]; //The second row has 2 columns
        arr[2] = new int[3]; //The third row has 3  columns

        // Initializing array
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length,j++){
                arr[i][j] = count++;
            }
        }

        System.out.println("Contents of 2-D array are : ");

        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length,j++){
                System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
    }

}

```
**Questions for practice :**
1. Find the max and min element in an array.
2. Find the second smallest and second largest element in an array.
3. Insert an element in an array at a certain index.
4. Insert an element in a sorted array.
5. Remove duplicate elements from an array.
6. Find all such pairs of elements, whose sum = n (These should not be duplicate values).
7. Find all the missing elemnts in an array having consecutive values.
8. WAP to impliment binary search.
9. WAP to impliment any sorting technique.
10. Find max and min in each row and each column.
11. Find the individual sum of each row and each column.