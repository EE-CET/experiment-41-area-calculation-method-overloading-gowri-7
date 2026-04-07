
import java.util.*;

class AreaCalculator {
    // Circle
    float calculateArea(float radius) {
        return (float)(Math.PI * radius * radius);
    }
    
    // Rectangle
    float calculateArea(float length, float breadth) {
        return length * breadth;
    }
    
    // Triangle
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        AreaCalculator ac = new AreaCalculator();
        
        double circle = ac.calculateArea(radius);
        double rectangle = ac.calculateArea(length, breadth);
        double triangle = ac.calculateArea(base, height);
        
        System.out.printf("%.2f\n", circle);
        System.out.printf("%.2f\n", rectangle);
        System.out.printf("%.2f", triangle);
    }
}
