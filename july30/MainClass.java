import java.util.Scanner;

class Dimensions{
    int length;
    int breadth;
    Dimensions(){
        this.length = 0;
        this.breadth = 0;
    }
    void get(){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        this.length = l;
        this.breadth = b;
        //sc.close();
    }
}
class Rectangle extends Dimensions{    
    int ar;
    Rectangle(){
        this.ar=0;
    }
    void area(){
        ar = super.length * super.breadth;
        System.out.println("Area of Rectangle = " + ar);
    }
}
class Triangle extends Dimensions{
    double ar;
    Triangle(){
        ar=0;
    }
    void area(){
        ar = super.length * super.breadth * 0.5;
        System.out.println("Area of Triangle = " + ar);
    }
}
public class MainClass{
    public static void main(String[] args) {
        //Dimensions d = new Dimensions();
        Rectangle d1 = new Rectangle();
        d1.get();
        d1.area();
        Triangle d2 = new Triangle();
        d2.get();
        d2.area();
    }
}