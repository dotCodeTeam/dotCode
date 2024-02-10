package com.ohgiraffers.java.practice.chanwool.polymorphism.interfaceImplements.run;

import com.ohgiraffers.java.practice.chanwool.polymorphism.interfaceImplements.PaymentService;

public class Application {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        paymentService.process(paymentService.answer());

    }
}
