package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        int s = 1700000;
        int m = 3;
        int n = 1500;
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n", s);
        System.out.printf("점포 내 직원 수 : %,d명\n", m);
        System.out.printf("점포 수 : %,d개\n\n", n);
        System.out.printf("연간 인건비 : %,d원", (long) n * m * s * 12);
    }
}
