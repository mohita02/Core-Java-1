import java.util.Scanner;

public class RemoveDuplicates{
    public static void removeDup(String s){
        char[] ch = s.toCharArray();
        int res_ind = 1, ip_ind = 1;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length-i-1;j++){
                if(ch[j]>ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        s = new String(ch);
        System.out.println(s);
        while(ip_ind != ch.length){
            if(ch[ip_ind] != ch[ip_ind-1]){
                ch[res_ind] = ch[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
        s = new String(ch);
        String s2 = s.substring(0,res_ind); 
        System.out.println("Output : " + s2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        removeDup(s);
    }
}