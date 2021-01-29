import org.junit.Test;

import java.util.Scanner;

/**
 * @author lfc
 * @date 2021/1/29 - 15:22
 */
public class Task7 {

    int real,imaginary;

    public void add(int real1,int imaginary1,int real2,int imaginary2){
        System.out.println("两复数相加的结果为:" + (real1 + real2) + "+" + (imaginary1 + imaginary2) + "i");
    }

    public void reduce(int real1,int imaginary1,int real2,int imaginary2){
        System.out.println("两复数相减的结果为:" + (real1 - real2) + "+" + (imaginary1 - imaginary2) + "i");
    }

    public void multiply(int real1,int imaginary1,int real2,int imaginary2){
        System.out.println("两复数相乘的结果为:" + (real1 * real2 - imaginary1 * imaginary2) + "+" + (real1 * imaginary2 + real2 * imaginary1) + "i");
    }


    @Test
    public void test1(){
        Scanner sc = new Scanner(System.in);
        int real1,real2,imaginary1,imaginary2;
        real1 = sc.nextInt();
        imaginary1 = sc.nextInt();
        real2 = sc.nextInt();
        imaginary2 = sc.nextInt();

        add(real1,imaginary1,real2,imaginary2);
        reduce(real1,imaginary1,real2,imaginary2);
        multiply(real1,imaginary1,real2,imaginary2);

    }

}
