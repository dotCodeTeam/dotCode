package com.ohgiraffers.java.study.chanWool;

import java.util.Scanner;

public class Quest {

    public void quest1()    {

        // 240129 literal 문제만들기

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

    public void quest2(){                                  //  이게 왜안될까요

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

    public void quest3(){                     //  for문으로 피라미드모양 만들기 해봤어요

        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 행 수을 입력하세요 : ");
        int row = sc.nextInt();
        String star = "";

        for ( int i = 1 ; i <= row ;  i++ ) {
            for ( int j = 1; j <= row ; j++ ) {
                star += "*";
                System.out.println(star);
            }
            star = "*";
            System.out.println();
        }
    }

    // 240201
    public void quest4() {       // while문 입력 계속 받을 수 있게 while문 추가해봤어요

        Scanner sc = new Scanner(System.in);

        /*
            정수 하나를 입력 받아 1부터 입력받은 정수까지의 합계를 구해보자.
         */
        while (true) {
            System.out.print("정수를 하나 입력하세요 : ");
            int num = sc.nextInt();

            int i = 1;
            int arSeq = 0;
            while ( i <= num ) {
                arSeq += i ;
                i++;
            }
            System.out.println("합계는 " + arSeq + "입니다.");
            System.out.println("=========================");
        }
    }

    // while문 입력 계속 받을 수 있게 while문 추가해봤어요

    public void quest5() {                     // 오늘 배운거 응용해봤습니다

        // 1~ 100 사이의 숫자를 입력받아 최소공배수 출력

        Scanner sc = new Scanner(System.in);

        int inum;
        int count = 0;

        while (count < 10) {
            System.out.print("첫번째 값 입력 (1~100) : ");
            int firNum = sc.nextInt();
            System.out.print("두번째 값 입력 (1~100) : ");
            int secNum = sc.nextInt();
            if ((firNum >= 1 || firNum <= 100) || (secNum >= 1 || secNum <= 100)) {
                for (inum = 1; inum <= 100; inum++) {

                    if (inum % firNum == 0 && inum % secNum == 0) {
                        System.out.println(firNum + "과(와) " + secNum + "의 최소 공배수는 " + inum + "입니다.");
                    } else {
                        continue;
                    }
                }
            } else {
                System.out.println("값을 다시 입력하세요. (1~100)");
                System.out.println();
                count = 0;
            }
            count++;
        }

    }
}
