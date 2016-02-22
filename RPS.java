import java.util.Random;

/**
 * @author Dan
 *
 *@param userChoice 
 *@param compChoice
 */
public class RPS {

	private static String _userChoice;//holds user rock paper or scissors value
	private static String _compChoice;// holds computer rock paper or scissor value
	
	
	public RPS()
	{
		_userChoice="";
		_compChoice = "";
	}
	
	//getters
	public String getCompChoice()	{return _compChoice;}
	public String getUserChoice() {return _userChoice;}
	
	//setters
	public void setUserChoice(String userChoice) {_userChoice = userChoice;}
	
	public void computerRPS()
	{
		int randomNumber;		
		
		Random rand = new Random();
		
		randomNumber = rand.nextInt(3);
		
		if (randomNumber == 0)
		{
			_compChoice = "Rock";
		}
		else if (randomNumber == 1)
		{
			_compChoice = "Paper";
		}
		else
		{
			_compChoice = "Scissors";
		}
		
	}
	
	
	public boolean userWon()
	{
		
		if (_userChoice.equals("Rock"))
		{
			if (_compChoice.equals("Scissors"))
			{
				return true;
			}
			else
				return false;
		}
		else if (_userChoice.equals("Paper"))
		{
			if (_compChoice.equals("Rock"))
			{
				return true;
			}
			else
				return false;
		}
		else
		{
			if (_compChoice.equals("Paper"))
			{
				return true;
			}
			else
				return false;
		}
	}
	
}
