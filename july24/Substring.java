import java.util.Scanner;

public class Substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] arr = new String[in.length()];
        int j=0;
        for(int i=0;i<=in.length()-3;i++){
            String sub = in.substring(i,i+3);
            if(sub.matches("[a-zA-Z]+")){
                arr[j] = sub;
                //System.out.println(sub);
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr.length-i-1;k++){
                if(arr[k]!=null){
                    if(arr[k].compareTo(arr[k+1])>0){
                        String temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null)
                System.out.println(arr[i]);
        }
        sc.close();
    }
}