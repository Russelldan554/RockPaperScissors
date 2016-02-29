public class RPSdriver {

	String validChoice1;
	String choices;
	String result;
	
	public RPSdriver()
	{
		validChoice1 = "";
		choices = "";
		result = " not showing up";
	}

	public void setValidChoice(String validChoice) {validChoice1 = validChoice;}
	
	public String getResult()  {return result;}
	public String getChoices() {return choices;}

	public void RPS() 
	{
		String compChoice = "";
		boolean won = false;

		RPS rps = new RPS();

		do
		{
			rps.computerRPS();
			compChoice = rps.getCompChoice();

			if (validChoice1.equalsIgnoreCase(compChoice))
			{
				result = ("computer chose same choice. Try again.");
			}

		} while (validChoice1.equals(compChoice));

		rps.setUserChoice(validChoice1);

		won = rps.userWon();

		if (won)
		{
			result = "You have won!";
		}
		else
			result = "You have lost!";

		choices = "The computer chose " + compChoice + " and you chose " + validChoice1 + ".";
	}
}
