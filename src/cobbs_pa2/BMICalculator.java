package cobbs_pa2;

import java.util.Scanner;

public class BMICalculator {
	
	private double weight;
	private double height; 
	private double bmiValue = 0;
	//bmiCategory;
	int unitType = 1;
	
	
	
	
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	// one scanner that spans the entire code
	Scanner sc = new Scanner(System.in);
	
	public void readUserData()
	{
		readUnitType(); //makes use of both readUnitType and 
		readMeasurmentData(); //readMeasurementData methods
	}
	
	
	
	private void readUnitType()
	{
		System.out.println("Are you using the Imperial System or Metric System?");
		String mI = sc.nextLine();
		
		if(mI.toUpperCase().equals("IMPERIAL"))
		 {
			      unitType = 2;
			      
			      
		 }
		else if (mI.toUpperCase().equals("METRIC"))
		{
			unitType = 3;
		}
		
		
	}
	
	
	
	private void readMeasurmentData()
	{
		
		if (unitType == 2)
		{
			readImperialData();
		}
		
		if (unitType == 3)
		{
			
			readMetricData();
		}	
	}	
	
	
	
	private void readMetricData()
	{
		System.out.println("What is your weight in kilograms? ");
		weight = sc.nextDouble();
		setWeight();
		
		System.out.println("What is your height in centimeters? ");
		height = sc.nextDouble();
		setHeight();
	
		calculateBmi();
		
		
	}
	
	
	
	
	private void readImperialData()
	{
		System.out.println("What is your weight in pounds? ");
		weight = sc.nextDouble();
		setWeight();
		
		System.out.println("What is your height in inches? ");
		height = sc.nextDouble();
		setHeight();
		
		calculateBmi();
	}
	
	
	
	
	private void calculateBmi()
	{
		bmiValue = (weight/height/height) * 10000;
		//calculates the user's BMI and BMI category
	}
	
	
	
	private void calculateBmiCategory()
	{
		calculateBmi();
		//determines the user's BMI category
	}
	
	
	
	public void displayBmi()
	{
		System.out.println("BMI is " + bmiValue );
		//prints the BMI value and category
		//to standard output
	}

	
	public void getWeight()
	{
		
	}
	
	
	private void setWeight()
	{
		if (weight < 0)
		{
			System.out.println("Enter a positive number!");
			
		}
		//if statement to make sure it is not negative
	}
	
	public void getHeight()
	{
		
	}
	
	
	private void setHeight()
	{
		if (height < 0)
		{
			System.out.println("Enter a positive number!");
			
		}
	}
	
	
	public void getBmi()
	{
		
	}
	
	
	public void getBmiCategory()
	{
		
	}
	
	
}
