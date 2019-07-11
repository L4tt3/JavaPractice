package org.dimigo.oop;

public class CarTest {
    public static void main(String[] args) {
        Car h = new Car();
        Car k = new Car();
        Car s = new Car();

        h.setColor("검정색");
        h.setCompany("현대자동차");
        h.setModel("제네시스");
        h.setMaxSpeed(225);
        h.setPrice(50000000);

        k.setColor("흰색");
        k.setCompany("기아자동차");
        k.setModel("K7");
        k.setMaxSpeed(246);
        k.setPrice(40000000);

        s.setColor("회색");
        s.setCompany("삼성자동차");
        s.setModel("SM7");
        s.setMaxSpeed(200);
        s.setPrice(38000000);

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
