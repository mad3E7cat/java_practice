class MovieTestDrive
{
	public static void main(String[] args) 
	{
		Movie one = new Movie();
		one.title = "Sell your soul";
		one.genre = "shooter";
		one.rating = -3;
		Movie two = new Movie();
		two.title = "Love after life...";
		two.genre = "drama";
		two.rating = 5;
		two.playFilm();
		Movie three = new Movie();
		three.title = "Arnie is back";
		three.genre = "shooter";
		three.rating = 127;

	}
}