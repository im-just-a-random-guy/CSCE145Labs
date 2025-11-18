/*
 * Written by Ryan Cook
 */

public class Vehicle 
{
	
	private String manuName;
	private int numOfCylinders;
	private String ownerName;
	
	
	//Default Constructor
	public Vehicle()
	{
		setManuName("none");
		setNumOfCylinders(6);
		setOwnerName("none");
	}
	
	//Parameterized Constructor
	public Vehicle(String manuName, int numOfCylinders, String ownerName)
	{
		setManuName(manuName);
		setNumOfCylinders(numOfCylinders);
		setOwnerName(ownerName);
	}

	public String getManuName() {
		return manuName;
	}

	public void setManuName(String manuName) 
	{
		if(manuName != null)											//Checks to see if anything "wrong" is inputted
		{
			this.manuName = manuName;
		}
		else
		{
			this.manuName = "none";
		}
	}

	public int getNumOfCylinders() {
		return numOfCylinders;
	}

	public void setNumOfCylinders(int numOfCylinders) {
		if(numOfCylinders > 0)
		{
			this.numOfCylinders = numOfCylinders;
		}
		else
		{
			this.numOfCylinders = 6;
		}
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		if(ownerName != null)
		{
			this.ownerName = ownerName;
		}
		else
		{
			this.ownerName = "none";
		}
	}
	
	public boolean equals(Vehicle other)								//Used the equals method from Lab 7 and edited it
	{
		if (other == null) 
        {
        	return false;
        }
        return this.manuName.equalsIgnoreCase(other.manuName) && 
        		this.numOfCylinders == other.numOfCylinders && 
        		this.ownerName.equalsIgnoreCase(other.ownerName);
	}
	
	public String toString()											//Used the toString format from Lab 7
	{
		return "Manufacturer's Name: " + manuName + "\n Number of Cylinders: " + numOfCylinders + "\n Owner's Name: " + ownerName + "\n";
	}
	
	
	
}
