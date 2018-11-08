/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */

package GolfGame;

import java.util.Random;

/*Summary of Class's Function:
 * Allows for creation of various types of putts
 * each with its own power, mean and stdDedv
 * Also, has a swing method to calculate distance ball travels hit with a specific putt
 */

//Creates public class putt
public class putt{

	//Declares variables
	private int power;
	private int mean;
	private int stdDev;
	
	//Creates constructor
	public putt(int power, int mean, int stdDev) {
		this.power = power;
		this.mean = mean;
		this.stdDev = stdDev;
	}

	//Generates getters and setters
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
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
	
	//The swing method variation for putt -- similar to the one for club class
	public int Swing(putt a) {
		Random random = new Random();
		double mean_adj = a.getMean();
		double stddev_adj = a.getStdDev();
		double distance = Math.abs(random.nextGaussian() * stddev_adj + mean_adj);
		return (int)distance;
		
	}
	
	
	
	
	

}
