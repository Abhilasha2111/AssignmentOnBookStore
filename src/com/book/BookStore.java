package com.book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore 
{
	
	
	public String bookID, title, author, category;
    public float price;
    Scanner scan = new Scanner(System.in);
    char more;
    ArrayList<Book>books = new ArrayList<Book>();
   
    public void add() throws InvalidBookException
	{
    	do
		{
			System.out.print("Book Id : ");
			bookID = scan.nextLine();
			System.out.print("Book Title : ");
			title = scan.nextLine();
			System.out.print("Book Author : ");
			author = scan.nextLine();
			System.out.print("Book Category : ");
			category = scan.nextLine();
			System.out.print("Book Price : ");
			price = scan.nextFloat();
			books.add( new Book(bookID , title , author , category , price) );
			
			System.out.print("\n\nDo you want to add more Books : ");
			more = scan.next().charAt(0);
			scan.nextLine();
		}
    	while(more=='Y'||more=='y');
			}
	
	public void searchbytitle() 
	{
		String title;
		System.out.print("Enter the Title for Search : ");
		title = scan.nextLine();
		for(Book book : books) 
		{
			if(book.title.equals(title)) 
			{
				System.out.print("\n\nBook Id : " + book.bookID + "\nBook Title : " + book.title + "\nBook Author : " + book.author + "\nBook Category : " + book.category + "\nBook Price : " + book.price);
			}
		}
	}
	public void searchbyauthor() 
	{
		String author;
		System.out.print("Enter the Author for Search : ");
		author = scan.nextLine();
		for(Book book : books) 
		{
			if(book.author.equals(author)) 
			{
				System.out.print("\n\nBook Id : " + book.bookID + "\nBook Title : " + book.title + "\nBook Author : " + book.author + "\nBook Category : " + book.category + "\nBook Price : " + book.price);
			}
		}
	}
	public void displayall() 
	{
		for(Book book : books)
		{
			System.out.print(books.size());
			System.out.print("\n\nBook Id : " + book.bookID + "\nBook Title : " + book.title + "\nBook Author : " + book.author + "\nBook Category : " + book.category + "\nBook Price : " + book.price);
		}
	}
}