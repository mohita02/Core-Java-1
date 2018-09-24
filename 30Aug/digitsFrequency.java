import java.util.*;
 class DigitsFrequency{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int num = sc.nextInt();
        System.out.println("Enter the elements : ");
        Integer arr[] = new Integer[num];
        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        int count[] = new int[10];
        for(int i=0;i<9;i++){
            count[i]=0;
        }
        for(int i=0;i<num;i++){
            int rem=0;
            while(arr[i]!=0){
                rem=arr[i]%10;
                if(rem==0){
                    count[0]++;
                }
                if(rem==1){
                    count[1]++;
                }
                if(rem==2){
                    count[2]++;
                }
                if(rem==3){
                    count[3]++;
                }
                if(rem==4){
                    count[4]++;
                }
                if(rem==5){
                    count[5]++;
                }
                if(rem==6){
                    count[6]++;
                }
                if(rem==7){
                    count[7]++;
                }
                if(rem==8){
                    count[8]++;
                }
                if(rem==9){
                    count[9]++;
                }
                arr[i]/=10;
            }
        }
        int large=0;
        int n=count[0];
        for(int i=1;i<10;i++){
            if(count[i]>n){
                large = i;
                n = count[i];
            }
            if(count[i]==n){
                if(large<i){
                    large=i;
                }
            }
        }
        System.out.println(large + " is the digit that occurs " + n + " times.");
        sc.close();
     }
 }