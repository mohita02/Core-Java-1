import java.util.Scanner;

public class frequencyOfWords{
    public static void count(String s){
        s = s.toLowerCase();
        for(int i='a';i<='z';i++){
            int ch = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    ch++;
                }
            }
            if(ch!=0){
                System.out.println((char)i + " = " + ch);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count(s);
        sc.close();
    }
}