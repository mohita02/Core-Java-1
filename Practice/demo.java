import java.util.Scanner;


public class demo{
    public static void unique(String s){
        String str = new String();
        int len = s.length();

        for(int i=0;i<len;i++){
            char c = s.charAt(i);

            if(str.indexOf(c)<0){
                str+=c;
            }
        }
        System.out.println("Output String : " + str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String : ");
        String s = sc.next();
        unique(s);
    }
}