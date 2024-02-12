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
            }

            if(pay != null){
                pay.payment();
                pay.complete();
            }   else  {
                System.out.println("잘못된 결제 방식입니다.");
            }
    }

    public String answer(Scanner sc){
        System.out.println("어떤 방식으로 결제하시겠습니까?");
        System.out.println("# 카드");
        System.out.println("# 현금");
        System.out.print(">> ");

        return sc.nextLine();
    }

}
