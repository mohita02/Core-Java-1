class one{
    void display(){
        System.out.println("One");
    }
}
class two extends one{
    void display(){
        System.out.println("Two");
    }
}
class three extends one{
    void display(){
        System.out.println("Three");
    }
}
public class inheritance{
    public static void main(String[] args) {
        one obj = new one();
        one obj1 = new two();
        one obj2 = new three();
        obj.display();
        obj1.display();
        obj2.display();
    }
}