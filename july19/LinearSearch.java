import java.util.*;
import java.lang.String;

public class LinearSearch{
    public static boolean search(String s, String s1){
        if(s.indexOf(s1)!=-1){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the a string : ");
        String str = sc.nextLine();
        System.out.print("Enter the substring to find : ");
        String str1 = sc.nextLine();
        boolean b = search(str,str1);
        if(b){
            System.out.println("ELement found !");
        }
        else{
            System.out.println("Not found !");
        }
        sc.close();

    }
}