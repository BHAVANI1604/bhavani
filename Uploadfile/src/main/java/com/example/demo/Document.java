package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity

@Table(name="document")
public class Document {
	
	@Id
	private long id;
	@Column(length =512, nullable = false,unique = true)
	private String name;
	
	private long size;

	
private byte [] content;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getSize() {
	return size;
}

public void setSize(long size) {
	this.size = size;
}



public byte[] getContent() {
	return content;
}

public void setContent(byte[] content) {
	this.content = content;
}

}
