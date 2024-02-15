package com.ohgiraffers.java.study.chanWool.library.test.view;

import com.ohgiraffers.java.study.chanWool.library.test.controller.BookManager;
import com.ohgiraffers.java.study.chanWool.library.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu(){}

    public void menu(){
        boolean isEnd = true;

        while (isEnd) {
            try {
                System.out.println("=======Dot Library======");
                System.out.println("1. 책 추가");
                System.out.println("2. 책 삭제");
                System.out.println("3. 책 검색");
                System.out.println("4. 전체 책 정보");
                System.out.println("0. 나가기");
                System.out.println(" * 프로그램을 종료하면 책 정보가 전부 사라집니다.");
                System.out.println("========================");
                System.out.print(">> ");
                int selectNum = Integer.parseInt(sc.next());

                switch (selectNum){
                    case 1:
                         bm.addBook(this.inputBook()); break;
                    case 2:
                         sc.nextLine();
                         bm.deleteBook(bm.searchBook(inputBookTitle())); break;
                    case 3:
                        boolean isSearch = true;
                        int searchNum;

                        while (isSearch){
                            System.out.println("===== 책 검색 =====");
                            System.out.println("1. 책 제목으로 찾기");
                            System.out.println("2. Index로 찾기");
                            System.out.println("3. 이전으로");
                            System.out.println("==================");
                            System.out.print(">> ");
                            try {
                                searchNum = Integer.parseInt(sc.next());

                                switch (searchNum) {
                                    case 1:
                                        bm.printBook(bm.searchBook(inputBookTitle())); break;
                                    case 2:
                                        int index;
                                        System.out.print("Index 입력 : ");
                                        try {
                                            sc.nextLine();
                                            index = sc.nextInt();
                                            System.out.println("=================검색결과=================");
                                            bm.printBook(index);
                                            System.out.println("=========================================");
                                        } catch (Exception e) {
                                            System.out.println("해당 인덱스에 책 정보가 없거나, index값 입력이 잘못되었습니다.");
                                            System.out.println("========================================="); break;
                                        } break;
                                    case 3:
                                        System.out.println("메뉴로 돌아갑니다.");
                                        isSearch = false;   break;
                                }

                            }   catch (Exception e){
                                System.out.println("다시 입력해주세요.");
                            }
                        }   break;

                    case 4:
                        System.out.println("====== 현재 도서 정보 ======");
                        bm.displayAll();

                        int categoryNum;
                        boolean isCategory = true;
                        while (isCategory) {
                            try {
                                System.out.println("==========================");
                                System.out.println("1.카테고리 오름차순 정렬 ");
                                System.out.println("2.카테고리 내림차순 정렬 ");
                                System.out.println("3.처음으로 ");
                                System.out.println("==========================");
                                System.out.print(">> ");
                                sc.nextLine();
                                categoryNum = sc.nextInt();

                                switch (categoryNum) {
                                    case 1,2 : bm.printBookList(bm.sortedBookList(categoryNum)); break;
                                    case 3:
                                        bm.printBookList(bm.sortedBookList(categoryNum));
                                        System.out.println("상태를 초기화하고 처음으로 돌아갑니다.");
                                        isCategory = false; break;
                                }
                            } catch (Exception e) {
                                System.out.println("다시 입력해주세요.");
                            }
                        } break;
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        System.out.println("========================");
                        isEnd = false;  break;
                    default:
                        System.out.println("해당하는 번호가 없습니다."); break;
                }
            }   catch (Exception e) {
                System.out.println("다시 입력해주세요.");
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
                category = Integer.parseInt(sc.next());
                if( category < 1 || category > 4 ){
                    sc.nextLine(); break;
                }   else {  book.setCategory(category); }

                sc.nextLine();
                System.out.print("제목 : ");
                title = sc.nextLine();
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
        searchTitle = sc.nextLine();
        return searchTitle;
    }

}
