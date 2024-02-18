package com.ohgiraffers.java.study.chanWool.library.test.controller;

import com.ohgiraffers.java.study.chanWool.library.hw2.model.comparator.AscCategory;
import com.ohgiraffers.java.study.chanWool.library.hw2.model.comparator.DescCategory;
import com.ohgiraffers.java.study.chanWool.library.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {
    ArrayList<BookDTO> br;

    public BookManager() {
        this.br = new ArrayList<>();
    }

    public void addBook(BookDTO book){
        if (book.getCategory() < 1 || book.getCategory() > 4 ) {
            System.out.println("해당 카테고리는 존재하지 않습니다.");
        }  else  {
                br.add(book);
                for(int i = 0; i < br.size(); i++ ){    br.get(i).setbNo(i+1);}
                System.out.println("'" + book.getTitle()+"' 이(가) 도서목록에 추가됩니다.");
        }
    }

    public void deleteBook(int index) {      // 전달받은 도서 번호로 해당 정보 삭제

        if ( index >= 0 && index < br.size()) {
            br.remove(index);
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("해당 제목의 책이 없습니다. 다시 확인해주세요.");
        }
        for(int i = 0; i < br.size(); i++ ){    br.get(i).setbNo(i+1);}

    }

    public int searchBook(String title){

        for(int i=0; i<br.size(); i++){
            if(br.get(i).getTitle().equals(title)){ return i ;}
        }
        return -1;
    }

    public void printBook(int index){
        if( index > 0 ){    System.out.println(br.get(index-1));}
        else           {    System.out.println("해당 번호는 없는 번호입니다.");}
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
