package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snacks = new Snack[3];
        snacks[0] = new Snack("새우깡","농심",1100,2);
        snacks[1] = new Snack("콘칲","크라운",1200,1);
        snacks[2] = new Snack("허니버터칩","해태",1500,4);

        for(Snack value : snacks){
            System.out.println(value.toString() + "\n");
        }


        System.out.printf("총 구매 금액 : %,d원",snacks[0].calcPrice()+snacks[1].calcPrice()+snacks[2].calcPrice());

    }
}
