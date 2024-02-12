package com.ohgiraffers.java.teamProject.laundryMachine.eunseongjo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        person person = new person();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========== 세탁기를 돌려라 ===========");
            System.out.println("1. 전원 켜기");
            System.out.println("2. 빨래감 넣기");
            System.out.println("3. 세제 넣기");
            System.out.println("4. 세탁시간 설정");
            System.out.println("5. 세탁시작");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : person.startUp(); break;
                case 2 : person.laundryIn(); break;
                case 3 : person.laundrySoapIn(); break;
                case 4 : person.laundryTimeIn(); break;
                case 5 : person.laundryStart(); break;
                default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
            }

        }

    }
}
