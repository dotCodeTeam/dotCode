package com.ohgiraffers.java.study.chanWool.laundry;

import java.util.Scanner;

public class Human {
    Machine machine = new Machine();
    private boolean isOn;
    boolean isPutStuff;
    boolean isPutCleanser ;
    boolean isTimer;
    boolean isLaundryDone;
    private int weight;

    public void turnOn(){
        if ( isOn ){
            if(isLaundryDone) {
                System.out.print("이미 빨래가 완료되었습니다. ");
            }   else  {
                System.out.println("이미 전원이 켜져 있습니다.");
            }
        }
        else  {
            this.isOn = true;
            machine.turnOn();
        }
    }

    public boolean checkMeaning(){
        Scanner sc = new Scanner(System.in);
        boolean isTrue = false;
        String answer = "";
        if( isOn ) {
            if(isLaundryDone) {
                System.out.print("건조하지 않고 종료하시겠습니까? ( Y/N ) :");
                answer += sc.next().charAt(0);
                if(answer.equals("Y") || answer.equals("y")) {
                    isTrue = true;
                }   else  {
                    System.out.println("메뉴로 돌아갑니다.");
                }
            }
        }
        return isTrue;
    }

    public void putStuff(){

        Scanner sc = new Scanner(System.in);

        if( isOn ) {
            if( isPutStuff ) {
                if ( isLaundryDone ) {
                    System.out.println("이미 빨래가 완료되었습니다.");
                }   else  {
                    System.out.println("이미 내용물이 들어있습니다.");
                }
            }
            else {
                System.out.println("빨래를 넣습니다.");
                System.out.println("========= 중량 선택 =========");
                System.out.println("1. 소량");
                System.out.println("2. 중간");
                System.out.println("3. 대량");
                System.out.println("4. 이전으로");
                System.out.print("메뉴를 선택해주세요 : ");
                this.weight = sc.nextInt();
                switch (weight) {
                    case 1:
                        machine.checkWeight(weight);
                        System.out.println(weight + "번 메뉴를 선택하셨습니다. 시간이 자동으로 설정됩니다.");
                        this.isPutStuff = true;
                        break;
                    case 2:
                        machine.checkWeight(weight);
                        System.out.println(weight + "번 메뉴를 선택하셨습니다. 시간이 자동으로 설정됩니다.");
                        this.isPutStuff = true;
                        break;
                    case 3:
                        machine.checkWeight(weight);
                        System.out.println(weight + "번 메뉴를 선택하셨습니다. 시간이 자동으로 설정됩니다.");
                        this.isPutStuff = true;
                        break;
                    case 4:
                        System.out.println("이전메뉴로 돌아갑니다...");
                        break;
                    default:
                        System.out.println("다시 선택해 주세요.");
                }
            }
        }   else  {
            System.out.println("전원이 켜져있지 않습니다. 먼저 전원을 켜주세요.");
        }
    }

    public void putCleanser(){
        if( isOn ){
            if ( isPutCleanser ){
                if ( isLaundryDone ){
                    System.out.println("이미 빨래가 완료되었습니다.");
                }   else  {
                    System.out.println("이미 세제를 넣었습니다.");
                }
            }
            else    {
                if( isLaundryDone ) {
                    System.out.println("빨래가 이미 완료됐습니다. 세제를 넣을 수 없습니다.");
                }   else {
                    this.isPutCleanser = true;
                    System.out.println("향기로운 다X니 세제를 넣습니다.");
                }
            }
        }
        else  {
            System.out.println("전원이 켜져있지 않습니다. 먼저 전원을 켜주세요.");
        }
    }
    public void timer(){
        if(isOn) {
            if(isPutStuff){
                if(isTimer){
                    if(isLaundryDone){
                        System.out.println("이미 빨래가 완료되었습니다.");
                    }   else {
                        System.out.println("이미 시간이 설정되었습니다.");
                    }
                }
                else  {
                    this.isTimer = true;
                    machine.checkTime();
                }
            }
            else    {
                System.out.println("내용물이 없습니다. 확인해주세요.");
            }
        }
        else {
            if(!isTimer){
                System.out.println("전원이 켜져있지 않습니다. 먼저 전원을 켜주세요.");
            }
        }
    }

    public void laundry(){
        if(isOn) {
            if(isPutStuff) {
                if(isLaundryDone) {
                    System.out.println("빨래가 완료되었습니다. 건조하기를 이용하세요.");
                }   else {
                    this.isLaundryDone = machine.shakeStuff();
                }
            }
            else {
                System.out.println("내용물이 없습니다. 확인해주세요.");
            }
        }
        else {
            System.out.println("전원이 켜져있지 않습니다. 먼저 전원을 켜주세요.");
        }
    }

    public boolean dry() {
        if(isOn) {
            if(isPutStuff) {
                if(isLaundryDone) {
                    machine.dryStuff();
                    isOn = false;
                }
            }
            else {
                System.out.println("내용물이 없습니다. 확인해주세요.");
            }
        }
        else {
            System.out.println("전원이 켜져있지 않습니다. 먼저 전원을 켜주세요.");
        }
        return machine.isAllDone();
    }


}
