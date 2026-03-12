// Abstract class
abstract class Shape {
    abstract void area();
}

// Rectangle class
class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

// Main class
class ShapeDemo {
    public static void main(String[] args) {

        // Array of Shape objects
        Shape[] s = {
            new Rectangle(10, 5),
            new Circle(7),
            new Triangle(8, 6)
        };

        // For-each loop to print areas
        for (Shape sh : s) {
            sh.area();
        }
    }
}