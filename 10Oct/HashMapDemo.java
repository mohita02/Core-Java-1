import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class HashMapDemo{
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("Z",5.5);
        hm.put("A",6.6);
        hm.put("B",7.7);
        hm.put("D",8.8);
        hm.put("Q",2.2);

        System.out.println(hm.entrySet());
        Set set = hm.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry<String, Double> me = (Map.Entry<String, Double>)i.next();
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}