package com.ohgiraffers.java.practice.chanwool.polymorphism.extend.school;

public class Others extends Student {

    public void lookAtScreen(){
        System.out.println("모두 스크린을 쳐다봅니다.");
    }

    @Override
    public void work() {
        System.out.println("강사님의 코드를 열심히 따라칩니다... 다들 타자가 엄청 빨라요!");
    }

    @Override
    public void learn() {
        System.out.println("java를 배웁니다... 저만 어려운거 아니죠?");
    }

    @Override
    public void rest() {
        System.out.println("쉬는시간입니다... 흡연자들이 꽤 있어요");
    }

    @Override
    public void eat() {
        System.out.println("점심시간입니다... 도시락 싸오신분들 부럽습니다..");
    }

    @Override
    public void study() {
        System.out.println("팀 스터디를 합니다... 김가네분들은 매일 모이시는거같아요");
    }

    @Override
    public void goHome() {
        System.out.println("집에 갑니다... 룰루~");
    }
}
