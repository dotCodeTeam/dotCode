package com.ohgiraffers.java.study.suBin.hw2.model.comparator;

import com.ohgiraffers.java.study.suBin.test.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return Integer.compare(o1.getCategory(), o2.getCategory());
    }
}

