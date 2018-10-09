import java.util.*;

class Test{
    public static void main(String[] args) {
        // Creating a new HashSet
        HashSet<String> hs = new HashSet<String>();

        //Adding new Elements to HashSet
        hs.add("India");
        hs.add("Australia");
        hs.add("America");
        hs.add("India"); //Adding a duplicate element

        //Displaying the HashSet
        System.out.println(hs);
        System.out.println("List contains India : " + hs.contains("India"));

        //Removing elements from the HashSet
        hs.remove("Australia");
        System.out.println("List after removing Australia : " + hs);

        //Iterating over hash set items
        System.out.println("Iterating over List :");
        Iterator<String> i = hs.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}