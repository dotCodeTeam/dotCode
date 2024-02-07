package com.ohgiraffers.java.project.LaundryMachine;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Human human = new Human();

        System.out.println("========== dotCode 세탁기 ==========");
        System.out.println("세탁기의 전원을 켜시겠습니까? true(켠다) 또는 false(켜지않는다) :  ");
        boolean bo = sc.nextBoolean();
        human.startUP();





    }
}
