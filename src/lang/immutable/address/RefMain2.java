package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); //컴파일 오류 발생
        b = new Address("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
