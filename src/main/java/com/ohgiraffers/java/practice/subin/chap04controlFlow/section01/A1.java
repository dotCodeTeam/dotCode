package com.ohgiraffers.java.practice.subin.chap04controlFlow.section01;

public class A1 {
    /* 1부터 10까지 합계를 구하고 결과를 출력하세요
     *
     * -- 출력 예시 --
     * 1부터 10까지의 합 : 55
     * */
    public void practiceApplication1 (){
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }
}
