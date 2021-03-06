package org.dimigo.oop;

public class CarTest2 {
    public static void main(String[] args) {
        Car2 h = new Car2("현대자동차","제네시스","검정색",225,50000000);
        Car2 k = new Car2("기아자동차","K7","흰색",246,40000000);
        Car2 s = new Car2("삼성자동차","SM7","회색",200,38000000);

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : " + h.getCompany());
        System.out.println("모델명 : " + h.getModel());
        System.out.println("색상 : " + h.getColor());
        System.out.println("최대속도 : " + h.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원",h.getPrice());
        System.out.println("\n");

        System.out.println("제조사명 : " + k.getCompany());
        System.out.println("모델명 : " + k.getModel());
        System.out.println("색상 : " + k.getColor());
        System.out.println("최대속도 : " + k.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원",k.getPrice());
        System.out.println("\n");

        System.out.println("제조사명 : " + s.getCompany());
        System.out.println("모델명 : " + s.getModel());
        System.out.println("색상 : " + s.getColor());
        System.out.println("최대속도 : " + s.getMaxSpeed() + "km");
        System.out.printf("가격 : %,d원",s.getPrice());

    }
}
