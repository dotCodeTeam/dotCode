package com.ohgiraffers.java.study.chanWool;

import java.util.Scanner;

public class ApplicationLaundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isTrue = true;
        Human human = new Human();

        do {
                System.out.println("============ 메뉴 선택 =============");
                System.out.println("1. 전원 켜기");
                System.out.println("2. 빨래 넣기");
                System.out.println("3. 세제 넣기");
                System.out.println("4. 시간 설정");
                System.out.println("5. 건조 하기");
                System.out.println("9. 종료 하기");
                System.out.print("메뉴를 선택하세요 :");
                int menuNum = sc.nextInt();

                switch (menuNum){
                    case 1 : human.turnOn(); break;
                    case 2 : human.putStuff(); break;
                    case 3 : human.putCleanser(); break;
                    case 4 : human.timer(); break;
                    case 5 : human.dry(); break;
                    case 9 :
                        System.out.println("프로그램을 종료합니다.");
                        isTrue = false; break;
                    default:
                        System.out.println("선택하신 메뉴는 없습니다. 다시 선택하세요.");
                }

        } while (isTrue);


    }
}
