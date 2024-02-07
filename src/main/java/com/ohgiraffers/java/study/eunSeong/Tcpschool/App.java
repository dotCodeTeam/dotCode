package com.ohgiraffers.java.study.eunSeong.Tcpschool;

public class App {

    public static void main(String[] args) {
        countdownFrom(10);
    }
    public static void countdownFrom(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("카운트다운이 종료되었습니다.");
    }
}
