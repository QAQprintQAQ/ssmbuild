package com.liwenli.dao;

import com.liwenli.pojo.Books;
import com.liwenli.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        是bookServiceImpl 而不是BookServiceImpl
        BookService bookServiceImpl = context.getBean("bookServiceImpl", BookService.class);//传接口
        for (Books books : bookServiceImpl.queryAllBook()) {

            System.out.println(books);
        }

    }


}
