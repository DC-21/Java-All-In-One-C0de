class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length = 0;
        breadth = 0;
    }
    Rectangle(int side){
        length = side;
        breadth = side;
    }
    Rectangle(int len, int brd){
        length = len;
        breadth = brd;
    }
    int calculateArea () {
        return length * breadth;
    }
}

public class ConstMain{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3);
        Rectangle rectangle3 = new Rectangle(4,5);

        System.out.println("area of rectangle1 is:" + rectangle1.calculateArea());
        System.out.println("area of rectangle2 is:" + rectangle2.calculateArea());
        System.out.println("area of rectangle3 is:" + rectangle3.calculateArea());
    }

}