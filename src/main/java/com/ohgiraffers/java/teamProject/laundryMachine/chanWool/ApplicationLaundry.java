package com.ohgiraffers.java.teamProject.laundryMachine.chanWool;

import java.util.Scanner;

public class ApplicationLaundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isTrue = true;
        Human human = new Human();

        do {
                System.out.println("============ 메뉴 선택 =============");
                System.out.println("1. 전원 ");    //
                System.out.println("2. 빨래 넣기"); 
                System.out.println("3. 세제 넣기"); // 빨래가 끝나면 못넣게
                System.out.println("4. 시간 설정"); // 빨래 중량을 선택해서 자동으로 설정
                System.out.println("5. 빨래 시작"); // 세제를 넣지 않았으면 확인 알림 / 넣었으면 바로 시작
                System.out.println("6. 건조 하기"); // 건조가 끝나면 자동으로 전원이 꺼지고 종료
                System.out.println("9. 종료 하기");
                System.out.println("===================================");
                System.out.print("메뉴를 선택하세요 : ");
                int menuNum = sc.nextInt();
                System.out.println("===================================");

                switch (menuNum){
                    case 1 :
                        human.turnOn();
                        if( human.checkMeaning() ) {   isTrue = false; break; }
                        else { break; }
                    case 2 : human.putStuff(); break;
                    case 3 : human.putCleanser(); break;
                    case 4 : human.timerSet(); break;
                    case 5 : human.laundry(); break;
                    case 6 : if( human.dry() ) {    isTrue = false; break; }
                             else { break; }
                    case 9 :
                        isTrue = false; break;
                    default:
                        System.out.println("선택하신 메뉴는 없습니다. 다시 선택하세요.");
                }

        } while (isTrue);
        System.out.println("프로그램을 종료합니다.");
    }
}
