import org.junit.Test;

import java.util.Scanner;

/**
 * @author lfc
 * @date 2021/1/25 - 15:07
 */
public class Task3 {
    @Test
    public void test1(){
        Scanner sc = new Scanner(System.in);

        String values = sc.next();
        char[] value = values.toCharArray();
        for(int i = 0;i < value.length / 2;i++){
            char temp = value[i];
            value[i] = value[value.length - i -1];
            value[value.length - i - 1] = temp;
        }
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]);
        }
    }


}
