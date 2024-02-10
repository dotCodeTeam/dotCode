package com.ohgiraffers.java.practice.chanwool.polymorphism.interfaceImplements;

public class CashPay implements Pay{
    @Override
    public void payment() {
        System.out.println("현금으로 결제합니다.");
    }
    @Override
    public void complete() {
        System.out.println("현금 결제가 완료되었습니다. 이용해주셔서 감사합니다!");
    }
}
