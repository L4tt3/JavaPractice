package org.dimigo.interfaces;

public class BMWEngine implements IEngine {

    @Override
    public void startEngine(){
        System.out.println("BMW 엔진 가동");
    }
    @Override
    public void stopEngine(){
        System.out.println("BMW 엔진 멈춤");
    }
}
