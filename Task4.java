import org.junit.Test;

/**
 * @author lfc
 * @date 2021/1/25 - 15:25
 */
public class Task4 {
    @Test
    public void test1(){
        int[] nums = new int[]{0,1,0,3,12};
        fun(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                System.out.print("[" + nums[i] + ",");
            }else if(i == nums.length - 1){
                System.out.print(nums[i] + "]");
            }else{
                System.out.print(nums[i] + ",");
            }
        }

    }

    public void fun(int[] nums){
        int[] temp = new int[nums.length];
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                temp[flag] = nums[i];
                flag++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

    }
}
