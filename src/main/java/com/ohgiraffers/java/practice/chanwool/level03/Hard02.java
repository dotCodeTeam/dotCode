package com.ohgiraffers.java.practice.chanwool.level03;

import java.util.Scanner;

public class Hard02 {
    public static void main(String[] args) {

        /* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
         *
         * -- 상품 가격 --
         * 사과 :  1000원
         * 바나나 : 3000원
         * 복숭아 : 2000원
         * 키위 : 5000원
         *
         * -- 입력 예시 --
         * 과일 이름을 입력하세요 : 바나나
         *
         * -- 출력 예시 --
         * 바나나의 가격은 3000원 입니다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("-- 상품 가격 --");
        System.out.println(" 사과 : 1000원");
        System.out.println("바나나 : 3000원");
        System.out.println("복숭아 : 2000원");
        System.out.println(" 키위 : 5000원");
        System.out.println("--------------");

        int applePrice = 1000;
        int bananaPrice = 3000;
        int peachPrice = 2000;
        int kiwiPrice = 5000;

        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = sc.nextLine();

        String order = "";
        int basket = 0;

        switch ( fruit ) {

            case "사과" :
                basket += applePrice;
                order += fruit;
                break;
            case "바나나" :
                basket += bananaPrice;
                order += fruit;
                break;
            case "복숭아" :
                basket += peachPrice;
                order += fruit;
                break;
            case "키위" :
                basket += kiwiPrice;
                order += fruit;
                break;
        }
        System.out.println(fruit + "의 가격은 " + basket + "원 입니다.");
    }
}
