package com.ohgiraffers.java.practice.chanwool.chap01.literal.level02.normal;

public class normal02 {
    public static void main(String[] args) {

        float korean = 80.5f;
        float math = 50.6f;
        float english = 70.8f;

        float scoreSum = korean + math + english;	 // 과목의 총점
        int scoreTotal = (int) scoreSum;			     // 실수 > 정수 형변환
        int scoreAverage = scoreTotal / 3;			   // 평균 값

        System.out.println("-- 출력 예시 --");
        System.out.println("총점 : " + scoreTotal);
        System.out.println("평균 : " + scoreAverage);

    }
}
