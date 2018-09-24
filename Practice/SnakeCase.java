import java.util.Scanner;

public class SnakeCase {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String s2 = s.replaceAll(" ", "-");
            System.out.println(s2);
        }
	}
}