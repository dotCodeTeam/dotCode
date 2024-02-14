package com.ohgiraffers.java.practice.chanwool.polymorphism.interfaceImplements.run;

import com.ohgiraffers.java.practice.chanwool.polymorphism.interfaceImplements.PaymentService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        Scanner scanner = new Scanner(System.in);

        paymentService.process(paymentService.answer(scanner));
    }
}
