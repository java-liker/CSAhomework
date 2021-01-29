package bonusQuestion;

/**
 * @author lfc
 * @date 2021/1/29 - 15:41
 */
public class DoMain {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        rabbit.eat();
        rabbit.sleep();
        System.out.println("---------我是兔子和老虎的分割线-----------");
        tiger.eat();
        tiger.sleep();

    }
}
