package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu(){}

    public void menu(){
        boolean isEnd = true;

        while (isEnd) {
            System.out.println("=======Dot Library======");
            System.out.println("1. 책 추가");
            System.out.println("2. 책 삭제");
            System.out.println("3. 책 검색");
            System.out.println("4. 전체 책 정보");
            System.out.println("0. 나가기");
            System.out.println("========================");
            System.out.print(">> ");
            int selectNum = sc.nextInt();

            switch (selectNum){
                case 1:
                     bm.addBook(this.inputBook()); break;
                case 2:
                    int bNo = bm.searchBook(inputBookTitle());
                    if (bNo != 0) {
                        bm.deleteBook(bNo);
                    }   else {
                        System.out.println("해당 제목의 책 정보가 없습니다.");
                    } break;
                case 3:
                    boolean isSearch = true;
                    int searchNum;

                    while (isSearch){
                        System.out.println("===== 책 검색 =====");
                        System.out.println("1. Index");
                        System.out.println("2. 카테고리 정렬");
                        System.out.println("3. 이전으로");
                        System.out.println("==================");
                        System.out.print(">> ");
                        try {
                            searchNum = sc.nextInt();

                            switch (searchNum) {
                                case 1:
                                    int index;
                                    System.out.print("Index 입력 : ");
                                    try {
                                        index = sc.nextInt();
                                        System.out.println("=================검색결과=================");
                                        bm.printBook(index);
                                        System.out.println("=========================================");
                                        isSearch = false;
                                    } catch (Exception e) {
                                        System.out.println("해당 인덱스에 책 정보가 없거나, index값 입력이 잘못되었습니다.");
                                        System.out.println("========================================="); break;
                                    } break;
                                case 2:
                                    int categoryNum;

                                    while (true){
                                        System.out.println("====================");
                                        System.out.println("1.오름차순정렬 ");
                                        System.out.println("2.내림차순정렬 ");
                                        System.out.println("3.처음으로 ");
                                        System.out.println("====================");
                                        System.out.print(">> ");

                                        categoryNum = sc.nextInt();
                                        if ( categoryNum == 1 ) {
                                            bm.printBookList(bm.sortedBookList(categoryNum));
                                        } else if ( categoryNum == 2 ) {
                                            bm.printBookList(bm.sortedBookList(categoryNum));
                                        }   else {
                                            System.out.println("처음으로 돌아갑니다.");
                                            isSearch = false;
                                            break;
                                        }
                                    } break;
                                case 3:
                                    System.out.println("이전으로 돌아갑니다.");
                                    isSearch = false;
                                    break;
                            }

                        }   catch (Exception e){
                            System.out.println("해당하는 번호가 없습니다. 다시 입력해주세요.");
                        }
                    }   break;

                case 4:
                        bm.displayAll(); break;
                case 0:
                    isEnd = false;
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("========================"); break;
            }

        }
    }

    public BookDTO inputBook(){

        BookDTO book = new BookDTO();

        int category;
        String title;
        String author;
        boolean isInput = true;

        do{
            try {
                System.out.print("카테고리 (1:인문, 2:자연과학, 3:의료, 4:기타) >> ");
                category = sc.nextInt();
                if( category <= 0 || category > 4 ){
                    sc.nextLine(); break;
                }   else {  book.setCategory(category); }

                System.out.print("제목 : ");
                title = sc.next();
                book.setTitle(title);

                System.out.print("저자 : ");
                author = sc.next();
                book.setAuthor(author);

                isInput = false;
            } catch (Exception e) {
                System.out.println("다시 입력해주세요.");
                sc.nextLine();
            }

        }   while (isInput);


        return book;
    }

    public String inputBookTitle(){
        String searchTitle;
        System.out.print("제목 검색 : ");
        searchTitle = sc.next();
        return searchTitle;
    }

}
