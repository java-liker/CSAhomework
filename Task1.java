import org.junit.Test;

import java.util.Scanner;

/**
 * @author lfc
 * @date 2021/1/25 - 12:30
 */
public class Task1 {
    @Test
    public void test1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入体重(kg):");
        double weight = sc.nextDouble();
        System.out.println("输入身高(m):");
        double height = sc.nextDouble();

        double result = weight / Math.pow(height,2);

        if(result < 18.5){
            System.out.println("过轻");
        }else if(result >= 18.5 && result < 25){
            System.out.println("正常");
        }else if(result >= 25 && result < 28){
            System.out.println("过重");
        }else if(result >= 28 && result < 32){
            System.out.println("肥胖");
        }else{
            System.out.println("非常肥胖");
        }
    }

}
