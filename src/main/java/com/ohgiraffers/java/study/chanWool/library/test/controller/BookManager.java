package com.ohgiraffers.java.study.chanWool.library.test.controller;

import com.ohgiraffers.java.study.chanWool.library.hw2.model.comparator.AscCategory;
import com.ohgiraffers.java.study.chanWool.library.hw2.model.comparator.DescCategory;
import com.ohgiraffers.java.study.chanWool.library.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {
    ArrayList<BookDTO> br;
    private int index = 0;

    public BookManager() {
        this.br = new ArrayList<>();
    }

    public void addBook(BookDTO book){
        if(book.getCategory() < 1 || book.getCategory() > 4 ) {
            System.out.println("해당 카테고리는 존재하지 않습니다.");
        }   else  {
            br.add(book);
            br.get(index).setbNo(index+1);      // 해당 인덱스 값에 맞게 번호 부여
            index++;
            System.out.println("'" + book.getTitle()+"' 이(가) 도서목록에 추가됩니다.");
        }
    }

    public void deleteBook(int index){      // 전달받은 도서 번호로 해당 정보 삭제


    }

    public int searchBook(String title){
        int temp = 0;

        for(int i=0; i<br.size(); i++){
            if(br.get(i).getTitle().equals(title)){ // 파라미터로 전달받은 문자열형 값과 비교
                temp = i ;                          // 위 조건문이 true라면 해당 인덱스의 원하는필드 값을 정수형으로 초기화
            }
        }
        return temp;
    }

    public void printBook(int index){
        System.out.println(br.get(index));
    }

    public void displayAll(){
        printBookList(br);
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        if( select == 1 ) {
            br.sort(new AscCategory());
        }  else if ( select == 2 ) {
            br.sort(new DescCategory());
        }   else  {
            br.sort(new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1, BookDTO o2) {
                    int result = 0;
                    if(o1.getbNo() > o2.getbNo()){
                        result = 1;
                    } else if (o1.getbNo() < o2.getbNo()){
                        result  = -1;
                    }   else { result = 0;}
                    return result;
                }
            });
        }
        return br;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for ( BookDTO bookList : br) {
            System.out.println(bookList);
        }
    }

}
