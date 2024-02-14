package com.ohgiraffers.java.teamProject.laundryMachine.sooBin;

public class LaundryMachine {
    private boolean powerOn;
    private boolean laundryInserted;
    private boolean detergentAdded;
    private int time; // 세탁시간
    private boolean laundryFinished;

    public LaundryMachine() {
        this.powerOn = false;
        this.laundryInserted = false;
        this.detergentAdded = false;
        this.time = 0; // 초기값은 0분
        this.laundryFinished = false;
    }

    public void turnOn() {
        powerOn = true;
        System.out.println("세탁기 전원을 켭니다.");
    }

    public void insertLaundry() {
        laundryInserted = true;
        System.out.println("빨래를 넣습니다.");
    }

    public void addDetergent() {
        detergentAdded = true;
        System.out.println("세제를 넣습니다.");
    }

    public void setTime(int time) {
        this.time = time;
        System.out.println("세탁 시간을 " +time+ "분으로 설정합니다.");
    }

    public void spinDry() {
        laundryFinished = true;
        System.out.println("빨래가 다 되었습니다. 탈수를 진행합니다.");
    }

    public void turnOff() {
        powerOn = false;
        System.out.println("세탁기 전원을 끕니다.");
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public boolean isLaundryInserted() {
        return laundryInserted;
    }

    public boolean isLaundryFinished() {
        return laundryFinished;
    }

    public boolean isDetergentAdded() {
        return  detergentAdded;
    }

    public int getTime() {
        return time;
    }
}
