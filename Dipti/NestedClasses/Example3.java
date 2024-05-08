package com.itsteps.abstraction;

import java.util.List;

public class Example3 {

	private String library;
	private List<Books> books;
	private List<Publishers> publishers;

	// inner class for book_details list
	private static class Books {

		private String title;
		private List<Author> author;
		private String genre;
		private int publication_year;
		private String isbn;
		private String language;

	}// Books class

	// inner class for author_details list
	private static class Author {

		private String name;
		private int birth_year;
		private int death_year;
		private String nationality;

	}// Author class

	// inner class for publishers_details list
	private static class Publishers {

		private String name;
		private int birth_year;
		private int death_year;
		private String nationality;

	}// Publisher class

}