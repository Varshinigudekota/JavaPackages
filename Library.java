package com.library.books;

public class Library {
	private String libraryName;
	private int totalBooks;
		
	public void setLibraryName(String libraryName) 
	{
		this.libraryName =  libraryName;
	}
	public void setTotalBooks(int totalBooks) 
	{
		this.totalBooks = totalBooks;
	}
	
	public String getLibraryName() 
	{
		return libraryName;
	}
	public int getTotalBooks() 
	{
		return totalBooks;
	}
	
	public void showLibraryDetails()	
	{
		System.out.println("Library Name: " + libraryName);
		System.out.println("Total Books: " + totalBooks);
	}
}