
public class Card {
	
	//Step 1: Attributes
	//They should be private so we don't access them incorrectly
	private String suit;
	private String displayValue;
	private int value;
	
	//Step 2: Constructors
	//These are the "printer" for the card
	//They make the object exist
	
	//Default
	//Set values to something "default"
	public Card()
	{
		setSuit("Spades");
		setDisplayValue("2");
		setValue(2);
	}
	
	//Parameterized
	//Set values to whatever we want
	public Card(String aS, String aD, int aV)
	{
		setSuit(aS);
		setDisplayValue(aD);
		setValue(aV);
	}
	
	//Step 3: Getters and Setters
	
	public void setSuit(String aS)
	{
		this.suit = aS;
	}
	public String getSuit() 
	{
		return this.suit;
	}

	public String getDisplayValue() 
	{
		return displayValue;
	}

	public void setDisplayValue(String displayValue) 
	{
		this.displayValue = displayValue;
	}

	public int getValue() 
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}
	
	public String toString()
	{
		return getDisplayValue() + " of " + getSuit();
	}
	
	
	
}
