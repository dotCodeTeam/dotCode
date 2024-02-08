package com.ohgiraffers.java.teamProject.LaundryMachine.chanWool;

public class Machine {

    private String weight;
    private int shakeTimer;
    private int dryTimer;
    private boolean doneLaundry;
    private boolean allDone;

    public void turnOn(){
        System.out.println("세탁기 전원을 켭니다.");
    }

    public void checkWeight(int weight){
        if      (weight == 1) {
            this.shakeTimer = 30;
            this.weight = "소량";
        }
        else if (weight == 2) {
            this.shakeTimer = 45;
            this.weight = "중간";
        }
        else  {
            this.shakeTimer = 60;
            this.weight = "대량";
        }
    }
    public void checkTime(){
        System.out.println("빨래감 중량이 '" + weight + "'이므로 " + shakeTimer + "분 만큼 동작합니다.");
    }

    public void shakeStuff(){
        System.out.println("빨래를 시작합니다.");
        System.out.println("====== 남은시간 ======");
        System.out.println("..."+ shakeTimer +"분...");
        System.out.println("..."+ shakeTimer/3 +"분...");
        System.out.println("..."+ shakeTimer/6 +"분...");
        System.out.println("..."+ shakeTimer/10 +"분...");
        System.out.println("====================");
        System.out.println("빨래가 완료되었습니다. (대충 알림음)");

        this.doneLaundry = true;
    }

    public void dryStuff(){
        this.dryTimer = shakeTimer/3;
        System.out.println("건조를 시작합니다.");
        System.out.println("====== 남은시간 ======");
        System.out.println("..."+dryTimer+"분...");
        System.out.println("..."+dryTimer/3+"분...");
        System.out.println("..."+dryTimer/12+"분...");
        System.out.println("====================");
        System.out.println("건조가 완료되었습니다. (대충 알림음)");

        this.allDone = true;
    }

    public boolean isLauandryDone(){ return doneLaundry; }
    public boolean isAllDone() {
        return allDone;
    }





}
