class Rectangle {
    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Constructor with one parameter
    Rectangle(int side) {
        length = side;
        breadth = side;
    }

    // Constructor with two parameters
    Rectangle(int len, int brd) {
        length = len;
        breadth = brd;
    }

    // Method to calculate the area of the rectangle
    int calculateArea() {
        return length * breadth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Create objects using different constructors
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5);
        Rectangle rectangle3 = new Rectangle(4, 6);

        // Calculate and display the areas of the rectangles
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
        System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
    }
}
