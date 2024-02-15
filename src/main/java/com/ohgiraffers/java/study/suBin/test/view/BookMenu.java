package com.ohgiraffers.java.study.suBin.test.view;

import com.ohgiraffers.java.study.suBin.test.controller.BookManager;
import com.ohgiraffers.java.study.suBin.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private BookManager manager;
    private  Scanner sc;

    public BookMenu(){
        this.manager = new BookManager();
        this.sc = new Scanner(System.in);
    }


    public void menu(){
        while (true) {
            System.out.println("========== 도서 관리 프로그램입니다. ==========");
            System.out.println("========== 프로그램을 선택해주세요. ===========");
            System.out.println("1. 도서 추가\n2. 도서 삭제\n3. 도서 검색\n4. 도서 정보 출력\n5. 도서 목록 전체 출력(오름차순)\n6. 도서 목록 전체 출력(내림차순) :\n 7.종료");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 초기화

            switch (choice) {
                case 1:
//                    manager.addBook(inputBook);
                    break;
                case 2:

            }
        }
    }

    public BookDTO inputBook(){
        System.out.println("도서 번호를 입력하세요 : ");
        int bNo = sc.nextInt();
        sc.nextLine();

        System.out.println("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();

        System.out.println("저자를 입력하세요 : ");
        String author = sc.nextLine();

        System.out.println(" 카테고리를 입력하세요 : ");
        String category = sc.nextLine();

        // 도서 번호는 0으로 임시 초기화?????
        int bNo = 0;

        return new BookDTO(bNo, title, author, category);
    }

    public String inputBookTitle(){
        System.out.println(" 도서 제목을 입력하세요 : ");
        return sc.nextLine();
    }


}
