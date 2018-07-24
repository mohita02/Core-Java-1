import java.util.Scanner;

public class NoOfWordsUsingCharAt {
    public static void count(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i+1)!=' ')) {
                count++;
            }
        }
        System.out.println("The number of words in the string are : " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count(s);
        sc.close();
    }
}
