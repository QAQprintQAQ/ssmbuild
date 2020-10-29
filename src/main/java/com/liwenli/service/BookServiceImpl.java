package com.liwenli.service;

import com.liwenli.dao.BookMapper;
import com.liwenli.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    //通过set方法实现组合
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public int addBook(Books book) {
        //service 调用dao层 ,需要组合dao
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return  bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {

        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
