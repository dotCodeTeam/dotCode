package com.ohgiraffers.java.practice.chanwool.polymorphism.interfaceImplements;

import java.util.Scanner;

public class PaymentService {
    private Pay pay;
    private final String CASH = "현금";
    private final String CARD = "카드";

    public PaymentService() {}

    public void process(String option){

            switch (option) {
                case CASH : pay = new CashPay();  break;
                case CARD : pay = new CardPay();  break;
                default: pay = new Pay() {@Override public void payment(){}
                                          @Override public void complete(){}};
                pay.fail(); break;

            }
            pay.payment();
            pay.complete();
    }

    public String answer(Scanner sc){
        String answer;
        System.out.println("어떤 방식으로 결제하시겠습니까?");
        System.out.println("# 카드");
        System.out.println("# 현금");
        System.out.print(">> ");
        answer = sc.nextLine();

        return answer;
    }

}
