import org.junit.Test;

/**
 * @author lfc
 * @date 2021/1/25 - 15:00
 */
public class Task2 {
    @Test
    public void test1(){
        int flag = 0;
        for(int i = 100;i < 1000;i++){
            if(fun(i)){
                flag++;
            }
        }
        System.out.println(flag);
    }

    public boolean fun(int num){
        if((int) (Math.pow(num / 100,3) + Math.pow(num / 10 % 10,3) + Math.pow(num % 10,3)) == num){
            return true;
        }else{
            return false;
        }
    }
}
