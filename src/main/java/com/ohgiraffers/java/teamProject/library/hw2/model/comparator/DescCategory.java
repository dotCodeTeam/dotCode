package com.ohgiraffers.java.teamProject.library.hw2.model.comparator;

import com.ohgiraffers.java.teamProject.library.test.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getCategory() >= o2.getCategory() ? -1 : 1;
    }
}
