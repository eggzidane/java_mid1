package enumeration.ref2;


import enumeration.ex2.ClassGrade;

public class DiscountService {

    //StringGrade를 참고하세요
    public int discount(Grade grade, int price) {

        return price * grade.getDiscountPercent() / 100;
    }
}
