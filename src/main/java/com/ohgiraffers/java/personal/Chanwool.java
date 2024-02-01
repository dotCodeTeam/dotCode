package com.ohgiraffers.java.personal;

import java.util.Scanner;

public class Chanwool {
    public static void main(String[] args){


        // 240129 내문제1

        /*
          1. 문자형 자료형을 선언한후 'a' 값을 대입하여 초기화한다.
          2. 생성된 문자형 변수를 실수 자료형으로 형변환 한다.
          3. 보기의 정수형 변수 num값에서 단항 증감연산자를 이용해
             1을 뺀값과 실수로 형변환 된 문자형 변수를 논리 비교연산자를 이용해
             비교하여 true 값이 출력되도록 실수형 변수값을 증감하여 출력문을 만드세요.
        */
        /* ===========출력예시============
           num = 98
           형변환 된 변수명 = 98.0
           true
        */

        // 보기
        int num = 99;               // 정수 자료형 num을 선언과 동시에 99값을 대입해 초기화
        char ch = 'a';              // 1. 문자형 자료형을 선언한 후 'a' 값을 대입하여 초기화
        double dnum = (double) ch;  // 2. 문자형 변수를 실수 자료형으로 형변환
        //    값 대입 시 형변환 double생략 가능 > 자동형변환
        num-- ;                     // 3. 정수형 변수 num 값에서 단항 증감연산자 이용해 -1
        dnum += 1;                  //    형변환 된 실수 값 증감/변환
        // dnum = dnum + 1 ;                        //    정답처리
        // dnum++;                                  //    정답처리
        // ++dnum;                                  //    정답처리

        // int  inum = (int)  dnum;                 //    정답처리
        // long lnum = (long) dnum;                 //    정답처리

        System.out.println("num = " + num);         //    출력결과 : num = 98
        System.out.println("dnum = " + dnum);       //    출력결과 : dnum = 98.0
        System.out.println(num == dnum);            //    출력결과 : true
        // System.out.println("inum = " + inum);    //    정답처리
        // System.out.println(num == inum);         //    정답처리
        // System.out.println("lnum = " + lnum);    //    정답처리
        // System.out.println(num == lnum);         //    정답처리

        // 보기의 정수값과  비교연산자를 이용하여 true 출력
        // double 실수형은 int 정수형을 포함하고 있어 소수점이 있더라도 값이 같도록 연산된다.






    }
    public void testForExample4(){

    /*
        2~9 사이의 구구단을 입력받아
        true인 경우 해당 단의 구구단을 출력하고,
        false인 경우 "반드시 2~9 사이의 양수를 입력해야 합니다" 출력
     */

        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 보기 ( 2 ~ 9 ) : ");
        int enterNum = sc.nextInt();
        int gugu = 1;
        int result = 0;

        if ( enterNum >= 2 && enterNum < 10 ){
            for ( int i = gugu ; i < 10 ; gugu++ ) {
                result = enterNum * gugu;
                System.out.println( enterNum + " * " + gugu + "= " + result );
            }
        } else {    System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다!");    }

        System.out.println("프로그램을 종료합니다...");
    }

    // 이게 왜안될까요

}
