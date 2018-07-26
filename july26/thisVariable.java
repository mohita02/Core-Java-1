class thisDemo{
    int x;
    thisDemo(){
        this(100);
        this.display();
    }
    thisDemo(int x){
        this.x = x;
    }
    void display(){
        System.out.println("x = " + x);
    }
}
public class thisVariable{
    public static void main(String[] args) {
        thisDemo td = new thisDemo();
    }
}