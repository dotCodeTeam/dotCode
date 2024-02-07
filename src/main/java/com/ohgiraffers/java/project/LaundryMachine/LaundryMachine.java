package com.ohgiraffers.java.project.LaundryMachine;

public class LaundryMachine{
    //세탁기의 기능
    public boolean isOn; //초기에는 세탁기의 시동이 꺼진 false 상태이다.

    public void startUp() {
        if (isOn) {
            System.out.println("세탁기 전원을 켜지 않았습니다.");
        } else {
            this.isOn = true;
            System.out.println("세탁기 전원을 켰습니다.");
        }
    }

}
