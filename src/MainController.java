import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	RPSdriver rps = new RPSdriver();
	private String result;
	private String choices;
	@FXML
	private Label label;
	@FXML
	private Label label2;
	
	public void rockButton(ActionEvent event)
	{
		rps.setValidChoice("Rock");
		rps.RPS();
		
		result = rps.getResult();
		choices = rps.getChoices();
		label.setText(result);
		label2.setText(choices);

	}
	
	public void paperButton(ActionEvent event)
	{
		rps.setValidChoice("Paper");
		rps.RPS();
		
		choices = rps.getChoices();
		result = rps.getResult();
		label.setText(result);
		label2.setText(choices);

	}
	
	public void scissorsButton(ActionEvent event)
	{
		rps.setValidChoice("Scissors");
		rps.RPS();
		
		choices = rps.getChoices();
		result = rps.getResult();
		label.setText(result);
		label2.setText(choices);

	}

}
