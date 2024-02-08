package com.ohgiraffers.java.practice.chanwool.polymorphism.extend.school;

public class Chanwool extends Student {

    public void snack(){
        System.out.println("준비해온 간식을 먹습니다... 우걱우걱");
    }
    public void headache(){
        System.out.println("두통이 생깁니다...");
    }
    public void havruta(){
        System.out.println("팀원들과 소통합니다...");
    }

    @Override
    public void work() {
        System.out.println("강사님의 코드를 열심히 따라칩니다.");
    }

    @Override
    public void learn() {
        System.out.println("java를 배웁니다... 오...모르겠는데?");
    }

    @Override
    public void rest() {
        System.out.println("쉬는시간입니다... 눈운동을 해줍니다...");
    }

    @Override
    public void eat() {
        System.out.println("점심시간이다! 요앞에 불백 맛있어요");
    }

    @Override
    public void study() {
        System.out.println("팀스터디를 합니다...dotCode 최고");
    }

    @Override
    public void goHome() {
        System.out.println("이미 집에 가고 없음...");
    }

}
