interface Area{
    int sArea();
    double cArea();
}
class SquareArea implements Area{
    int s;
    SquareArea(int s){
        this.s = s;
    }
    public int sArea(){
        return s*s;
    }
    public double cArea(){
        return 0;
    }
}
class CircleArea implements Area{
    int r;
    CircleArea(int r){
        this.r = r;
    }
    public int sArea(){
        return 0;
    }
    public double cArea(){
        return (3.14*r*r);
    }
}
public class AreaMain{
    public static void main(String[] args) {
        Area obj;
        obj = new SquareArea(5);
        System.out.println("Area of square = " + obj.sArea());
        obj = new CircleArea(10);
        System.out.println("Area of circle = " + obj.cArea());
    }
}