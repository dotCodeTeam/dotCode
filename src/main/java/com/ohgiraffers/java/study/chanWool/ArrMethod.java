package com.ohgiraffers.java.study.chanWool;

import java.util.Scanner;

public class ArrMethod {

    public void arrMethod(){

        int iarr[] = new int[10];
        for( int i = 0; i < iarr.length; i++ )   {
            iarr[i] = i+1;
            System.out.print(iarr[i] + " ");
        }
    }

    public int inputNum()  {
        Scanner sc = new Scanner(System.in);
        System.out.print("인덱스 길이 값 입력 : ");
        return sc.nextInt();
    }

    public int[] indexLength(int[] arr) {
        int[] temp = arr;

        if(temp.length <= 10) {
            for( int i = 0; i < temp.length; i++ ){
                temp[i] = i+1;
            }
        } else {    System.out.println("인덱스 길이 값이 10을 초과하였습니다.");
            temp = null;
        }
        return temp;
    }

    public void printArr(int[] arrTemp2) {
        int[] result = arrTemp2;
        int index;        System.out.println("======================"); System.out.print(" ");

        for (index = 0; index < result.length; index++ ) {
            System.out.print(result[index] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print(" ");
    }

}
