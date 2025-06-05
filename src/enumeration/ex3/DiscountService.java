package enumeration.ex3;



public class DiscountService {

    //StringGrade를 참고하세요
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == Grade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == Grade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }
        return price * discountPercent / 100;
    }
}
