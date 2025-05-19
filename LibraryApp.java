package com.library.app;

import com.library.books.Library;

import com.library.staff.Librarian;

public class LibraryApp 
{
	public static void main(String[] args) 
	{
		Library l = new Library();
		l.setLibraryName("My world library");
		l.setTotalBooks(1000);
		

		Librarian lib = new Librarian();
		lib.setLibrarianName("Krishna");
		lib.setYearsOfExperience(5);

		l.showLibraryDetails();
		System.out.println();
		lib.showEngineDetails();
	}
}