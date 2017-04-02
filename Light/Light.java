import java.util.Scanner;
class Light
{
	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);
			int lightspeed = 186000; // miles per second
			int days = 0;
			System.out.print("Enter number of days: ");
			days = in.nextInt();
			long seconds = days * 24 * 60 * 60;
			long dist = seconds * lightspeed;
			System.out.println("During " + days + " days the light will pass: " + dist + " miles.");
	}
}