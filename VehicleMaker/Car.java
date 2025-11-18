/*
 * Written by Ryan Cook
 */

public class Car extends Vehicle
{
	
	private double gasMileage;
	private int numOfPassengers;
	
	//Default
	public Car()
	{
		super();
		setGasMileage(1.0);
		setNumOfPassengers(1);
	}
	
	
	//Parameterized								//Used the super instance variables, and then added the class-specific instance variables
	public Car(String manuName, int numOfCylinders, String ownerName, double gasMileage, int numOfPassengers)
	{
		super(manuName, numOfCylinders, ownerName);
		setGasMileage(gasMileage);
		setNumOfPassengers(numOfPassengers);
	}


	public double getGasMileage() {
		return gasMileage;
	}


	public void setGasMileage(double gasMileage) {
		if(gasMileage >= 0)
		{
			this.gasMileage = gasMileage;
		}
		else
		{
			this.gasMileage = 1.0;
		}
	}


	public int getNumOfPassengers() {
		return numOfPassengers;
	}


	public void setNumOfPassengers(int numOfPassengers) {
		if(numOfPassengers >= 0)
		{
			this.numOfPassengers = numOfPassengers;
		}
		else
		{
			this.numOfPassengers = 1;
		}
	}
	
	public boolean equals(Car other)			//Used the equals method from Lab 7, and the super equals method from the dog/animal in-class example
	{
		return super.equals(other) &&
				this.gasMileage == other.gasMileage &&
				this.numOfPassengers == other.numOfPassengers;
	}
	
	public String toString()					//Used the toString from Lab 7, and used the super toString from the dog/animal in-class example
	{
		return super.toString() + " Gas Mileage: " + gasMileage + "\n Number of Passengers: " + numOfPassengers + "\n";
	}
	
	
	
}
