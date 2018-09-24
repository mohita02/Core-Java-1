import java.util.*;

class DecreasingSequence{
    static int compare(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int decreseCount(int[] arr,int n){
        int count=0;
        int max=1;
        int nMax=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                max++;
            }
            else{
                if(arr[i]<arr[i-1]){
                    count++;
                    System.out.println(max);
                    int ans = compare(max,nMax);
                    nMax = ans;
                    max=1;  
                }
                
            }
            
        }
        System.out.println("Max length is " + (nMax));
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a[] = {21,12,10,9,13,14,7,8,4,6};
        int[] a = new int[10];
        int len = a.length;
        for(int i=0;i<len;i++){
            int num = sc.nextInt();
            a[i] = num;
        }
        //System.out.println(len);
        int count = decreseCount(a,len);
        System.out.println("Count is " + count);
    }
}
