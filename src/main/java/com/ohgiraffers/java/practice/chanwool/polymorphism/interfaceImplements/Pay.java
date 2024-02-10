package com.ohgiraffers.java.practice.chanwool.polymorphism.interfaceImplements;

public interface Pay {
    public abstract void payment();     // 명시적 선언
    void complete();    // 묵시적 선언 가능
    default void fail(){
        System.out.println("결제에 실패했습니다. 다시 시도해주세요.");
    }

}
