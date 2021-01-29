package task5;

/**
 * @author lfc
 * @date 2021/1/25 - 16:06
 */
public class domain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("the area is" + circle.getArea(3));
        System.out.println("the perimeter is" + circle.getPerimeter(3));
    }
}
