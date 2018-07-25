import java.util.Scanner;

public class Substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String[] arr = new String[100];
        int k=0;
        // Store substrings in array
        for(int i=0;i<s.length();i++){
            for(int j=1;j<=s.length()-i;j++){
                String sub = s.substring(i,i+j);
                arr[k] = sub;
                k++;
            }
        }
        String large;
        // Finding substring in another string
        large = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                if(s1.toLowerCase().contains(arr[i].toLowerCase())){
                    System.out.println(arr[i]);
                    if(large.length()<arr[i].length())
                        large = arr[i];
                }
            }
        }
        System.out.println(large);
        sc.close();
    }
}