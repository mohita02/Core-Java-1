import java.util.Scanner;

public class ReverseWords {
    public static void reverse(String s) {
        char[] in = s.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        for(int i=0;i<in.length;i++){
            System.out.print(in[i]);
        }
        System.out.print(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] all = s.split("\\s");
        for(int i=0;i<all.length;i++){
            reverse(all[i]);
        }
        System.out.println();
        sc.close();
    }
}