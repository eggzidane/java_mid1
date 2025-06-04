package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // 코드 작성
        Integer integer1 = Integer.valueOf(str); //String -> Integer
        System.out.println("integer1 = " + integer1);

        int intValue = integer1.intValue(); //Integer -> int
        System.out.println("intValue = " + intValue);

        int integer2 = Integer.valueOf(intValue); //int -> Integer
        System.out.println("integer2 = " + integer2);



    }
}
