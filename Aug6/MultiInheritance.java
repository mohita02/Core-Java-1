interface InterfaceOne{
    void display();
}
interface InterfaceTwo{
    void display();
}
class ClasOne implements InterfaceOne,InterfaceTwo{
    public void display(){
        System.out.println("Display function !");
    }
    // public void display(){
    //     System.out.println("Print function !");
    // }
}
public class MultiInheritance{
    public static void main(String[] args) {
        InterfaceOne one;
        InterfaceTwo two;
        one = new ClasOne();
        two = new ClasOne();
        one.display();
        two.display();
    }
}