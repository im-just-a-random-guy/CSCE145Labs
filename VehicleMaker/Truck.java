/*
 * Written by Ryan Cook
 */

public class Truck extends Vehicle
{
	
	private double loadCapacity;
	private double towCapacity;
	
	//Default Constructor
	public Truck()
	{
		super();
		setLoadCapacity(1.0);
		setTowCapacity(1.0);
	}
	
	//Parameterized Constructor							//Used the super instance variables, and then added the class-specific instance variables
	public Truck(String manuName, int numOfCylinders, String ownerName, double loadCapacity, double towCapacity)
	{
		super(manuName, numOfCylinders, ownerName);
		setLoadCapacity(loadCapacity);
		setTowCapacity(towCapacity);
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		if(loadCapacity >= 0)
		{
			this.loadCapacity = loadCapacity;
		}
		else
		{
			this.loadCapacity = 1.0;
		}
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		if(towCapacity >= 0)
		{
			this.towCapacity = towCapacity;
		}
		else
		{
			this.towCapacity = 1.0;
		}
	}
	
	public boolean equals(Truck other)				//Used the equals method from Lab 7, and the super equals method from the dog/animal in-class example
	{
		return super.equals(other) && 
				this.loadCapacity == other.loadCapacity &&
				this.towCapacity == other.towCapacity;
	}
	
	public String toString()							//Used the toString from Lab 7, and used the super toString from the dog/animal in-class example
	{
		return super.toString() + " Load Capacity: " + loadCapacity + "\n Towing Capacity: " + towCapacity + "\n";
	}
	
	
	
}
