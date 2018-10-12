import java.util.*;
public class col_qu1
{
    public static void main(String args[])
    {
        ArrayList <Integer> al=new ArrayList<Integer>();
        int num;
        int size;
        int count=0;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            num=sc.nextInt();
            al.add(num);
        }
        System.out.println(al);
        for(int j=0;j<al.size();j++)
        {
            if(al.get(j)>90)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}