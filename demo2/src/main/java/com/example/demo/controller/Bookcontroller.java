package com.example.demo.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.BookDAO;
import com.example.demo.Model.BookModel;
import com.example.demo.service.Bookservice;

@RestController
public class Bookcontroller {
	@Autowired
	Bookservice bookservice;

	@RequestMapping(value="/getAllBooks",method = RequestMethod.GET)
	public List<BookModel> getallbooks() {
		return bookservice.getAllBooks();
	}
	@RequestMapping(value ="/addbook",method = RequestMethod.POST)	
	public int addBook(@RequestParam("bookid") int bookid,@RequestParam("bookname")String bookname,
			@RequestParam("bookauthor") String bookauthor,@RequestParam("bookprice") int bookprice)
	{
		return bookservice.addBooks(bookid,bookname,bookprice,bookauthor);
	}
	@RequestMapping(value="deletebook1/{bookid}",method=RequestMethod.DELETE)
	public int deletebookbyid(@PathVariable(name="bookid")int bookid)
{
return bookservice.deleteBook(bookid);
}
	@RequestMapping(value="/Update/{bookid}",method=RequestMethod.PUT)
	public String str(@RequestBody BookModel bm,@PathVariable int bookid)
	{
		return bookservice.update(bm,bookid)+"added succesfully";
	}
}