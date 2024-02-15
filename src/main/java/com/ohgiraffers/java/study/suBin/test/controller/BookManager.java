package com.ohgiraffers.java.study.suBin.test.controller;

import com.ohgiraffers.java.study.suBin.hw2.model.comparator.AscCategory;
import com.ohgiraffers.java.study.suBin.test.model.dto.BookDTO;
import com.ohgiraffers.java.study.suBin.test.view.BookMenu;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {

    //
    private BookMenu bookMenu;
    private ArrayList<BookDTO> br; // 도서 목록을 저장할 ArrayList 객체 생성

    public BookManager() {
        br = new ArrayList<>();
        bookMenu = new BookMenu();
    }

    // 도서 추가 메소드
    public void addBook(BookDTO book) {
        try {
            // BookMenu 객체를 사용하여 inputBook()메소드를 호출하여 도서 정보를 입력받음
            BookDTO newBook = bookMenu.inputBook();
            // 입력받은 도서 정보를 ArrayList에 추가
            br.add(newBook);
            System.out.println("도서 추가 완료");
        } catch (Exception e) { // 예외처리
            System.out.println("도서 추가에 실패했습니다. 다시 시도해주세요.");
        }
    }

    // 도서 삭제 메소드
    public void deleteBook(int index) {
        boolean found = false; // 삭제된 도서가 있는지 여부를 저장하기 위한 변수

        for (int i = 0; i < br.size(); i++) {
            if (i == index) {
                br.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("도서 삭제 완료");
        } else {
            System.out.println("유효하지 않은 도서 번호 입니다.");
        }
//        if(index >= 0 && index < br.size()) { // for문 돌려볼까???!!!
//            br.remove(index); // 도서 목록에서 해당 인덱스의 도서 제거
//            System.out.println("도서 삭제 완료");
//        } else {
//            System.out.println("유효하지 않은 도서 번호입니다.");
//        }
    }

    // 도서 검색 메소드
    public int searchBook(String title) {
        for (int i = 0; i < br.size(); i++) {
            if (br.get(i).getTitle().equals(title)) {
                return i;  // 도서가 발견되면 인덱스 반환
            }
        }
        System.out.println("도서를 찾을 수 없습니다.");
        return -1; // 도서가 발견되지 않으면 -1 반환
    }

    // 도서 출력 메소드
    public void printBook(int index) {
        if (index >= 0 && index < br.size()) {
            BookDTO bookDTO1 = br.get(index);
            System.out.println("도서 정보 : ");
            System.out.println("제목 : " + bookDTO1.getTitle());
            System.out.println("저자 : " + bookDTO1.getAuthor());
            System.out.println("카테고리 : " + bookDTO1.getCategory());
        } else {
            System.out.println(" 유효하지 않은 도서 입니다. ");
        }
    }

    // 전체 도서 목록 출력 메소드
    public void displayAll() throws IntrospectionException {
        System.out.println("도서 목록 : ");
        for (int i = 0; i < br.size(); i++) {
            System.out.println((i + 1) + ". " + br.get(i));
        }
    }

    // 정렬된 도서 목록 반환 메소드
    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(br); // 도서 목록을 복사하여 새로운 리스트

        switch (select) {
            case 1: // 인문
            case 2: // 자연과학
            case 3: // 의료
            case 4: // 기타
                Comparator<BookDTO> comparator = null;
                if (select == 1) {
                    comparator = new AscCategory();
                } else if (select == 2) {
                    comparator = new AscCategory();
                } else if (select == 3) {
                    comparator = new AscCategory();
                } else if (select == 4) {
                    comparator = new AscCategory();
                } else {
                    System.out.println("유효하지 않은 정렬 방식입니다.");
                    return sortedList; // 잘못된 정렬 방식이면 원래의 순서를 유지한 채로 반환
                }
                Collections.sort(sortedList, comparator);
                break;
            default:
        }
        return sortedList;
    }

        // 도서 목록 출력 메소드
        public void printBookList (ArrayList<BookDTO> br) {
            System.out.println("도서 목록 : ");
            for (BookDTO bookDTO : br) {
                System.out.println("도서 번호: " + bookDTO.getbNo());
                System.out.println("제목: " + bookDTO.getTitle());
                System.out.println("저자: " + bookDTO.getAuthor());
                System.out.println("카테고리: " + bookDTO.getCategory());
                System.out.println();
            }
        }
    }

