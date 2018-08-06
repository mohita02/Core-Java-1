import java.util.Scanner;

class Lapidrome{
    String left;
    String right;
    int mid;
    int cn;
    int[] count = new int[26];
    Lapidrome(){
        left="";
        right="";
        mid=0;
        cn=0;
    }
    void breakString(String str){
        if(str.length()%2!=0){
            mid = (int)str.length()/2;
            left = str.substring(0,mid);
            right = str.substring(mid+1,str.length());
            // int l1 = check(left);
            // int l2 = check(right);
            // if(l1==l2){
            //     System.out.println("Yes");
            // }
            // else{
            //     System.out.println("No");
            // }
            System.out.println(left + " " + right);
        }
        else{
            mid = (int)str.length()/2;
            left = str.substring(0,mid);
            right = str.substring(mid,str.length());
            int l1 = check(left);
            int l2 = check(right);
            if(l1==l2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            //System.out.println(left + " " + right);
        }
    }
    int check(String s){
        String n = "abcdefghijklmnopqrstuvwxyz";
        char[] charArray = n.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<26;j++){
                count[j]=0;
                char c = s.charAt(i);
                if(charArray[j]==c){
                    count[i]++;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                cn+=count[i];
            }
        }
        return cn;
    }
        
}
public class ques2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        Lapidrome lp = new Lapidrome();
        String a = sc.nextLine();
        for(int i=0;i<n;i++){
            s[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++){
            lp.breakString(s[i]);
        }
    }
}