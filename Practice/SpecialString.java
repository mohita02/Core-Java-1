import java.util.Scanner;

public class SpecialString{
    public static void reverse(char str[]){
        int left = 0, right = str.length - 1;
        while(left<right){
            if(!Character.isAlphabetic(str[left])){
                left++;
            }
            else if(!Character.isAlphabetic(str[right])){
                right--;
            }
            else{
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.next();
            char[] arr = s.toCharArray();
            reverse(arr);
            String s1 = new String(arr);
            System.out.println("The reversed string  : " + s1);
        }
    }

    
}