package com.ohgiraffers.java.study.suBin.LaundryMachine;

public class Application {
    public static void main(String[] args) {
        // 세탁기 객체 생성
        LaundryMachine laundryMachine = new LaundryMachine();

        // 빨래하는 사람 객체 생성
        Human human = new Human();

        // 빨래를 한다
        human.doLaundry(laundryMachine);
    }
}
