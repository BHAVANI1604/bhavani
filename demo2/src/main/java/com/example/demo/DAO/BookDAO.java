package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.BookModel;

@Repository
public class BookDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<BookModel> getAll() {
		List<BookModel> li = jdbcTemplate.query("select * from book1",
				(result, rowNum) -> new BookModel(result.getInt("bookid"), result.getString("bookname"),
						result.getString("bookauthor"), result.getInt("bookprice")));

		return li;
	}
	public int addBookss(int bookid, String bookname,String bookauthor,int bookprice) {
		// TODO Auto-generated method stub
		String query="insert into book1 values(?,?,?,?)";
		return jdbcTemplate.update(query,bookid,bookname,bookauthor,bookprice);
	}
	public int deletebook1(int bookid) {
		
		String query="delete from book1 where bookid=?";
		return jdbcTemplate.update(query,bookid);
	
	}
	public int update(BookModel bm,int bookid) {
		String s="update book1 set bookname=?,bookauthor=?,bookprice=? where bookid=?";
		return jdbcTemplate.update(s,new Object[] {bm.getBookname(),bm.getBookauthor(),
				bm.getBookprice(),bookid});
	}
	
	}
	

	
	
	




