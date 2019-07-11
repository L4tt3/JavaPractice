package org.dimigo.inheritance;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] smartPhones = {
                new IPhone("iPhone XS","애플",1370000),
                new Galaxy("갤럭시 S10","삼성",1500000)
        };

        for(SmartPhone s:smartPhones){
            System.out.println(s);
            s.turnOn();
            s.pay();
            s.useSpecialFunction();
            s.turnOff();
            System.out.println();
        }
    }
}
