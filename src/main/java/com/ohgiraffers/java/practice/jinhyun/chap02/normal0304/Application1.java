package com.ohgiraffers.java.practice.jinhyun.chap02.normal0304;

public class Application1 {
    public static void main(String[] args) {

        /* 실수를 변수로 선언하여 점수를 저장하고,
         * 이를 정수로 변환하여 점수가 90점 이상이면 "A",
         * 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D",
         * 60점 미만이면 "F"를 출력하는 프로그램을 작성해본다.
         *
         * -- 출력 예시 --
         *
         * 홍길동의 이번 점수등급은 B입니다.
         *
         * */

        double score = 90.0;
        double score1 = 80.0;
        double score2 = 70.0;

        int inum1 = (int)score;
        int inum2 = (int)score1;
        int inum3 = (int)score2;




        String result1 = (inum1 <= 60)? "B다" : (inum3 < inum2)? "B다" : "F다";
        System.out.println(result1);
     }

    }

