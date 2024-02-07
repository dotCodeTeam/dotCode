package com.ohgiraffers.java.study.chanWool;

import java.util.Scanner;

public class Human {

    Machine machine = new Machine();
    private boolean isOn;

    public void turnOn(){
        if ( isOn ){
            System.out.println("이미 전원이 켜져 있습니다.");
        }   else  {
            this.isOn = true;
            System.out.println("전원을 켭니다.");
        }
    }

    public void putStuff(){
        if( isOn ) {
            System.out.println("빨래를 넣습니다.");
        }   else  {
            System.out.println("빨래감이 가득 찼습니다. 세제를 넣으세요.");
        }
    }

    public void putCleanser(){
        if( isOn ){
            System.out.println("세제를 넣습니다.");
        }   else  {
            System.out.println("세제를 이미 넣었습니다. 시간을 설정해 주세요.");
        }
    }
    public void timer(){

    }
    public void dry() {

    }


}
