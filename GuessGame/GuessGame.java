class GuessGame
{
	Player p1, p2, p3;

	void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		//
		int p1Num = 0, p2Num = 0, p3Num = 0;
		//
		boolean p1Guessed = false, p2Guessed = false, p3Guessed = false;
		//
		int randNum = (int) (Math.random()*10);
		System.out.println("Number is generated, try to guess...");
		//
		while(true)
		{
			p1.guess();
			p1Num = p1.number;
			System.out.println("Player1 thinks it's "+p1Num);	
			//
			p2.guess();
			p2Num = p2.number;
			System.out.println("Player2 thinks it's "+p1Num);
			//
			p3.guess();
			p3Num = p3.number;
			System.out.println("Player3 thinks it's "+p1Num);
			//
			if(p1Num == randNum)
			{
				p1Guessed = true;
			}
			if(p2Num == randNum)
			{
				p2Guessed = true;
			}
			if(p3Num == randNum)
			{
				p3Guessed = true;
			}
			if(p1Guessed || p2Guessed || p3Guessed)
			{
				System.out.println("We've got a winner!");
				if(p1Guessed)
				{
					System.out.println("Player1 guessed, the number is " + p1Num);
				}
				if(p2Guessed)
				{
					System.out.println("Player2 guessed, the number is " + p2Num);
				}
				if(p3Guessed)
				{
					System.out.println("Player3 guessed, the number is " + p3Num);
				}
				System.out.println("Game's over.");
				break;
			}
			else
			{
				System.out.println("Players will try again...");
			}
		}
	}
}















