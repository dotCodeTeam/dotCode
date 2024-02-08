package com.ohgiraffers.java.study.jinHyun.laundry;

public class LaundryMachine {

    public boolean isOn;            // 전원
    public boolean inPut;          // 넣음
    public boolean sj;            // 세제

    public boolean clack;         // 시간
    public boolean ts;           // 탈수

    public void isOn() {
        if (isOn) {
            System.out.println("전원 안됨");
        } else {
            this.isOn = true;
            System.out.println("전원 켜짐");
        }
    }

    public void inPut() {
        if (isOn) {
            System.out.println("빨래 넣음");
        } else {
            this.inPut = true;
            System.out.println("빨래 없음");
        }


    }

    public void sj() {
        if(isOn) {
            System.out.println("세제 넣음");
        } else {
            this.sj = true;
            System.out.println("세제 없음");
        }
    }

    public void clack() {
        if (isOn) {
            System.out.println("시간 설정됨");
        } else {
            this.clack = true;
            System.out.println("시간 기능 고장");
        }

    }

    public void ts() {
        if (isOn) {
            System.out.println("탈수 후 종료합니다.");
        } else {
            this.ts = true;
            System.out.println("탈수 불가능");

        }
        System.out.println();
    }
}
