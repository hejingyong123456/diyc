package com.haha.tests;

import com.haha.book;
import com.haha.user;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testAdd(){

        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        book use=context.getBean("book",book.class);
        System.out.println(use);
        use.f();
    }
}
