package com.ohgiraffers.java.practice.chanwool.level03;

import java.util.Scanner;

public class Hard01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번쨰 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */

        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
//        String ch = sc.nextLine(); // 값을 안받고 그냥 넘어가서 switch문 연산식에 들어가지 않아 연산 없이 그대로 출력됐음.
        char ch = sc.next().charAt(0);

        int firstNum = first;
        int secondNum = second;
        int result = 0;

        switch ( ch ) {
            case '+' :              // "+" 로 값을 넣어줬더니
                result = firstNum + secondNum;
                break;
            case '-' :
                result = firstNum - secondNum;
                break;
            case '*' :
                result = firstNum * secondNum;
                break;
            case '/' :
                result = firstNum / secondNum;
                break;
            case '%' :
                result = firstNum % secondNum;
                break;
        }

        System.out.println(firstNum + " " +  ch + " " + secondNum + " = " + result);
    }
}
