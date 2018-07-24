import java.util.Scanner;

public class Nationalities{
    public static void frequency(String[] a,int n){
        int freq[] = new int[26];
        for(int i=0;i<26;i++){
            freq[i] = 0;
        }
        for(int i=0;i<n;i++){
            if(a.   [i]>='a'&& a[i]<='z'){
                freq[a[i]-97]++;
            }
            else if(a[i]>='A' && a[i]<='Z'){
                freq[a[i]-65]++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.printf("%c = %d\n",(i+97),freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for(int i=0;i<num;i++){
            arr[i] = (char)sc.next();
        }
        frequency(arr,num);
    }
}