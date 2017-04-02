import java.util.Random;
class QuestionClass implements InterfaceConstants
{
	Random rand = new Random();
	int ask()
	{
		int probe = (int) (100 * rand.nextDouble());
		if(probe < 30) return NO;
		else if(probe < 50) return LATER;
		else if(probe < 65) return MAYBE;
		else if(probe < 75) return SOON;
		else if(probe > 80) return YES;
		else return NEVER;
	}
}