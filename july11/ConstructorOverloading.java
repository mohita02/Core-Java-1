class Shape{
    int length,breadth;
    double radius;
    
    Shape(){}
    Shape(int l, int b){
        System.out.println("Area of Rectangle is " + l*b);
    }

    Shape(double r){
        System.out.println("Area of circle is " + 3.14*r*r);
    }

    Shape(double a, int l, int b){
        System.out.println("Area of Triangle is " + a*l*b);
    }
    public static void main(String[] args) {
        Shape rect = new Shape(10,20); 
        Shape circle = new Shape(2.5);
        Shape tri = new Shape(0.5,23,24);       
    }
}