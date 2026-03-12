interface Shape {
    void area();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        c.area();
    }
}