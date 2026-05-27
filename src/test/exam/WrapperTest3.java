package test.exam;

public class WrapperTest3 {
    static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.valueOf(str);
        System.out.println(integer);

        int integer2 = integer.intValue();
        System.out.println(integer2);

        Integer integer3 = Integer.valueOf(integer2);
        System.out.println(integer3);
    }
}
