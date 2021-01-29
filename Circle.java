package task5;

/**
 * @author lfc
 * @date 2021/1/25 - 15:44
 */
public class Circle {
    int radius;

    public double getArea(int radius){
        return Math.pow(radius,2) * Math.PI;
    }

    public double getPerimeter(int radius){
        return 2 * radius * Math.PI;
    }
}
