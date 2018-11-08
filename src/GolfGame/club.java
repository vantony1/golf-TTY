/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */



package GolfGame;

/*Summary of Class's Function:
 * Allows for creation of various types of clubs
 * each with its own number, name, mean and stdDedv
 * Also, has a swing method to calculate distance ball travels hit with a specific club
 */

//Imports Java utilities 
import java.util.*;


//Creates a public class names club
public class club {
	
	//Declares variables
	private int num;
	private String name;
	private int mean;
	private int stdDev;
	
	//Creates a constructor
	public club(int num, String name, int mean, int stdDev) {
		this.num = num;
		this.name = name;
		this.mean = mean;
		this.stdDev = stdDev;
	}

	//Generates getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMean() {
		return mean;
	}

	public void setMean(int mean) {
		this.mean = mean;
	}

	public int getStdDev() {
		return stdDev;
	}

	public void setStdDev(int stdDev) {
		this.stdDev = stdDev;
	}
	
	/*Swing method which computes the distance the ball travels 
	 * as its hit with club a with power power
	 * accepts club a and int power as inputs and returns an integer
	 */
	public int Swing(club a, int power) {
		//Creates random an instance of Random class
		Random random = new Random();
		//Adjusts the mean and stdDev of club a dependent of power input
		double mean_adj = a.getMean() * power / 10.0;
		double stddev_adj = a.getStdDev() * power / 10.0;
		
		//Actually computes the positive distance through Gaussian method described in project Packet
		double distance = Math.abs(random.nextGaussian() * stddev_adj + mean_adj);
		
		//Returns distance through int cast as other variables were doubles for accuracy
		return (int)distance;
		
	}
	
	

}
