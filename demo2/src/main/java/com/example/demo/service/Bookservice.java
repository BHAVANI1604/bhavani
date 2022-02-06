package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.DAO.BookDAO;
import com.example.demo.Model.BookModel;


@Service
public class Bookservice {
	@Autowired
	BookDAO bookdao;

	public List<BookModel> getAllBooks() {
		return bookdao.getAll();
	}
	public int addBooks(int bookid,String bookname,int bookprice,String bookauthor)
	{
		return bookdao.addBookss(bookid,bookname,bookauthor,bookprice);
	}
	public int deleteBook(int bookid) {
		
		return bookdao.deletebook1(bookid);
	}
	
public int update(BookModel bm,int bookid) {
		
		return bookdao.update(bm, bookid);
	}

   
	
}
