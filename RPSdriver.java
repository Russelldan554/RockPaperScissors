import java.util.Scanner;

public class RPSdriver {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		String validChoice = "";
		String input;
		char repeat;
		boolean won;
		
		RPS rps = new RPS();
		
		do
		{
			System.out.println("Time to play Rock, Paper, Scissors!");
		
		do
		{
		if (validChoice.equals(rps.getCompChoice()))
				{
				System.out.println("computer chose same choice. Try again.");
				}
		validChoice = userChoice();
		
		rps.setUserChoice(validChoice);
		} while (validChoice.equals(rps.getCompChoice()));
		
		
		rps.computerRPS();
		
		won = rps.userWon();
		
		if (won)
		{
			System.out.println("You have won!");
		}
		else
			System.out.println("You have lost!");
		
		System.out.println("The computer chose " + rps.getCompChoice() + " and you chose " + validChoice + ".\n");
		keyboard.nextLine();
		
		System.out.println("Play again?(y or n");
		input = keyboard.nextLine();
		repeat = input.charAt(0);
		
		} while (repeat == ('y'));
		
		
		
	}
	
	private static int inputValid()
	{
		int a;//holds value of user integer

		
		do	{//checks to make sure integer is integer
		while (!keyboard.hasNextInt())
		{
			System.out.println("1-3 only");
			keyboard.next();
		}
		a = keyboard.nextInt();
		if (a < 0)
			System.out.println("1-3 only");
		} while (a < 0 && a > 4);//makes sure integer 1-3
		
		return a;
	}
	
	public static String userChoice() 
	{
		
		String rps = "";
		
		System.out.println("pick Rock Paper or Scissors: \n1-Rock\n2-Paper\n3-Scissors");
		int input = inputValid();

		
		if (input == 1)
		{
			rps = "Rock";
		}
		else if (input == 2)
		{
			rps = "Paper";
		}
		else if (input == 3)
		{
			rps = "Scissors";
		}
		else
			System.out.print("userchoice failed");
		
		return rps;
	}



	}
