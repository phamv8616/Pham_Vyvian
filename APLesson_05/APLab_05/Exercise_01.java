public class Exercise_01
{
	static int player;
	static int computer;
	static String winner;

	public static void main(String[]args)
	{
		int player = (int)(Math.random()*6)+1;
		int computer = (int)(Math.random()*6)+1;
		
		rollDice();
		
		System.out.println("You rolled a " +player);
		System.out.println("The computer rolled a " +computer);
		System.out.println("The winner is " +winner);
	}
	
	public static void rollDice()
	{
		if(player > computer)
			winner = "Player";
		if(computer > player)
			winner = "Computer";	
	}
}