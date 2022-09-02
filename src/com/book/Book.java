package com.book;

public class Book 
{
	public String bookID, title, author, category;
    public float price;
	public Book(String bookID, String title, String author, String category, float price)throws InvalidBookException
    
	{
		if(bookID.toLowerCase().charAt(0)== 'b'&& bookID.length() == 4)
		{
			this.bookID=bookID;
		}
		else
		{
			throw new InvalidBookException("InvalidBookID - Book must be start with 'b' and length of 4");
			
		}
		this.title = title;
		this.author = author;
		if(category.toLowerCase().equals("science")||category.toLowerCase().equals("fiction")||category.toLowerCase().equals("technology")||category.toLowerCase().equals("others"))
		{
		this.category = category;	
		}
		else
		{
		throw new InvalidBookException("Category must be science, fiction, technology or others ");
		}
		if(price<0) 
		{
			throw new InvalidBookException(" Price cannot be negetive ");
		}
		else
		{
			this.price = price;
		}
	}
}
