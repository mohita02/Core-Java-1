import java.util.Scanner;
import java.lang.String;

public class NumberOfWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        int n = words.length-1;
        System.out.println("Number of words : " + n);
        sc.close();
    }
}