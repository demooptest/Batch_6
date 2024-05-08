package com.itsteps.abstraction;

import java.util.List;

public class Example1 {

	private List<Movies> movies;

	// inner class for movie_details list
	private static class Movies {

		private String title;
		private int year;
		private String genre;
		private List<Director> director;
		private List<Cast> cast;
		private List<Crew> crew;
		private List<Reviews> reviews;

	}// Movies class

	// inner class for director_details list
	private static class Director {

		private String name;
		private int birth_year;
		private String nationality;

	}// Director class

	// inner class for cast_details list
	private static class Cast {

		private String name;
		private String role;

	}// Cast class

	// inner class for crew_details list
	private static class Crew {

		private String name;
		private String role;

	}// Crew class

	// inner class for reviews_details list
	private static class Reviews {

		private String source;
		private float rating;

	}// Reviews class

}