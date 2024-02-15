package com.ohgiraffers.test.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.hw2.model.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    ArrayList<BookDTO> br;
    private int index = 0;

    public BookManager() {
        this.br = new ArrayList<>();
    }

    public void addBook(BookDTO book){
        if(book.getCategory() <= 0 || book.getCategory() > 4 ) {
            System.out.println("해당 카테고리는 존재하지 않습니다.");
        }   else  {
            br.add(book);
            br.get(index).setbNo(index+1);      // 해당 인덱스 값에 맞게 번호 부여
            index++;
            System.out.println(book.getTitle()+"이(가) 도서목록에 추가됩니다.");
        }
    }

    public void deleteBook(int index){

        for(int i = 0; i < br.size(); i++ ){
            br.remove(br.get(index-1));
        }
        System.out.println((index-1)+"번째 책이 삭제되었습니다.");
    }

    public int searchBook(String title){
        int temp = 0;

        for(int i=0; i<br.size(); i++){
            if(br.get(i).getTitle().equals(title)){ // 파라미터로 전달받은 문자열형 값과 비교
                temp = br.get(i).getbNo();          // 위 조건문이 true라면 해당 인덱스의 원하는필드 값을 정수형으로 초기화
            }
        }
        return temp;                                // 그 후 해당 정수값 반환
    }

    public void printBook(int index){
        System.out.println(br.get(index));
    }

    public void displayAll(){
        printBookList(br);
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        if( select == 1) {
            br.sort(new AscCategory());
        }   else  {
            br.sort(new DescCategory());
        }
        return br;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for ( BookDTO bookList : br) {
            System.out.println(bookList);
        }
    }

}
