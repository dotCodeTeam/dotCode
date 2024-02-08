package com.ohgiraffers.java.practice.chanwool.polymorphism.dotCode;

public class Developer extends Human{

    public void typingCode(){
        System.out.println("키보드치는소리 타닥타닥타닥...");
    }
    public void shotGun(){
        System.out.println("책상에 샷건치는소리... 쾅!!!");
    }
    public void sigh(){
        System.out.println("한숨쉬는소리... 에휴...");
    }

    @Override
    public void walk() {
        super.walk();
    }
    @Override
    public void talk() {
        super.talk();
    }
    @Override
    public void eat() {
        super.eat();
    }
    @Override
    public void sleep() {
        super.sleep();
    }
}
