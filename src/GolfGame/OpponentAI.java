/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */

package GolfGame;

/*Summary of Class's Function:
 * Allows for creation of new holes and stimulates the playing of a hole by a player
 */

//Creates public class OpponentAI
public class OpponentAI {
	
	//Creates method Golfer which stimulates AI playing a hole
	public int Golfer(Hole a) {
		
		//gets length of hole a and sets it to int distance
		int distance = a.getYards();
		
		//sets parActual to 0
		int parActual = 0;

		//Creates new clubFinder
		findClub clubFinder = new findClub();
		
		//Declares variables
		int min;
		club current;
		int optPower;
		int clubNum;
		int travel;
		int distancef;
		putt putt;
		int puttNum;
	
		//While loop which continues while distance is not equal 1 i.e. till ball in sunk
		while (distance != 1) {
			
			//Creates int array ClubMeanAdj which calculates distance ball will travel based on mean of the ten clubs
			//In order to allow AI to choose best club for given distance
			int[]clubMeanAdj = {Math.abs(distance - 230), Math.abs(distance - 215), Math.abs(distance - 180), 
							    Math.abs(distance - 170), Math.abs(distance - 155), Math.abs(distance - 145), 
							    Math.abs(distance - 135), Math.abs(distance - 125), 
							    Math.abs(distance - 110), Math.abs(distance - 50)};
			
			/* Sets the value of min to the minimum value of clubMeanAdj found by calling the minimum method
			 */
			min = minimum(clubMeanAdj);
			
			/*Calls on the findIndex method to find the index of value min in clubMeanAdj 
			 * sets clubNum's value to index found + 1 to find the number of club that produces the 
			 */
			clubNum = findIndex(clubMeanAdj, min) + 1;
			
			//Uses club finder to set current club to club numbered clubNum
			current = clubFinder.clubCurrent((clubNum));
			
			/*Creates an int Array that calculates and stores estimated travel of ball hit with current club at power 1-10
			 * To allow AI to choose best power for use with current club for given distance
			 */
			int[]clubPowerSelect = {Math.abs(distance - current.Swing(current, 1)), Math.abs(distance - current.Swing(current, 2)), 
								   Math.abs(distance - current.Swing(current, 3)), Math.abs(distance - current.Swing(current, 4)), 
								   Math.abs(distance - current.Swing(current, 5)), Math.abs(distance - current.Swing(current, 6)), 
								   Math.abs(distance - current.Swing(current, 7)), Math.abs(distance - current.Swing(current, 8)), 
								   Math.abs(distance - current.Swing(current, 9)), Math.abs(distance - current.Swing(current, 10))};
			

			/* Sets the value of min to the minimum value of clubPowerSelect found by calling the minimum method
			 */
			min = minimum(clubPowerSelect);
			
			/*Calls on the findIndex method to find the index of value min in clubPowerSelect 
			 * sets optPower's value to index found + 1
			 */
			optPower = findIndex(clubPowerSelect, min) + 1;
			
			
			//Computes travel using current club aet optPower
			travel = Math.abs(distance - current.Swing(current, optPower));
			
			//Sets distance to travel
			distance = travel;
			
			
			/*If conditional triggered when distance is greater than 21 yards, i.e., ball is out of the green
			 * else if conditional triggered if ball sunk from outside of green
			 * else statement triggered when ball is in the green i.e. distance less than equal to 20 yards
			 */
			
			if (distance >= 21) {
				//Adds AI stroke count and prints out AI's actions informatively
				parActual++;
				System.out.println("The AI took a shot with club " + clubNum + " at power "  + optPower);
				System.out.println("The AI is at a distance of " + distance + " yards from the hole");
			} else if (distance == 1 || distance  == 0) {
				//Adds AI stroke count and prints out AI's actions informatively and breaks;
				parActual++;
				System.out.println("The AI took a shot with club " + clubNum + " at power "  + optPower);
				System.out.println("The AI got the ball in the hole");
				break;
			} else {
				//Adds AI stroke count and prints out AI's action and postion informatively
				parActual++;
				
				System.out.println("The AI took a shot with club " + clubNum + " at power "  + optPower);
				System.out.println("The AI is in the green");
				
				distancef = distance*3;
				
				System.out.println("The AI is at a distance of " + distancef + " feet from the hole");
				
				//Creates int array puttSelect which calculates distance ball will travel based on mean of the ten powers
				//In order to allow AI to choose best putting power for given distance
				int[]puttSelect = {Math.abs(distancef - 1), Math.abs(distancef - 2), Math.abs(distancef - 4), 
									Math.abs(distancef - 8), Math.abs(distancef - 12), Math.abs(distancef - 16), 
									Math.abs(distancef - 20), Math.abs(distancef - 25), 
									Math.abs(distancef - 30), Math.abs(distancef - 40)};
				
				
				/* Sets the value of optPower to the minimum value of clubPowerSelect found by calling the minimum method
				 */
				optPower = minimum(puttSelect);
				
				/*Calls on the findIndex method to find the index of value optPower in puttSelect 
				 * sets puttNum's value to index found + 1
				 */
				puttNum = findIndex(puttSelect, optPower) + 1;
				
				//Assigns AI's choice of putt power as the current putt given choice of power
				putt = clubFinder.puttCurrent(puttNum);
				
				/* Computes variable travel as the absolute value of distance in feet of user from hole minus 
				 * distance in feet ball traveled calculated with the swing method
				 * Possible since both distancef and putt means and stddev are in feet
				 */
				travel = Math.abs(distancef - putt.Swing(putt));
				
				//Sets value of travel as distancef 
				distancef = travel;
				
				//Prints out AI's actions informatively
				System.out.println("The AI putted  at power "  + (puttNum + 1));
				
				/*If statement triggered when distancef is <= 1 i.e. the ball is sunk
				 * else if statement triggered when distancef is >60 i.e. the ball is out of the green
				 * else statement triggered otherwise
				 * Prints AI's position informatively
				 */
				if (distancef <= 1) {
					System.out.println("The AI got the ball in the hole");
					break;
				} else if (distancef > 60) {
					System.out.println("The AI is out of the green");
					distance = distancef/3;
					System.out.println("The AI is at a distance of " + distance + " yards from the hole");
				} else {
					continue;
				}
				
			}

		}
		//Returns how many strokes AI used to finish goal
		return parActual;
	}
	
	//Minimum method to find the minimum value of a given int array
	public static int minimum(int [] a) {
	    int min = a[0];
	    
	    for (int i = 0; i < a.length - 1; i++) {
	    
	    	if (a[i] < min) {
	    	 	min = a[i];
	    	} 
	   
	    	
	    }
		
		return min;
	}
	
	//findIndex method to find the index of a target integer in a int array
	public static int findIndex(int [] a, int target) {
		int location = 0;
		
		for (int i = 0; i < a.length; i++) {
	    if (target == a[i]) {
	    	location = i;
	    }
	  }
		return location;
	}
	
	//printArray method that prints the array for use in printing final scores 
	public void printArray(int[] score) {
		int i;
		for(i = 0; i < 18; i++) {
			
			if (i < 17) {
				System.out.print(score[i] + " ");
			} else {
				System.out.print(score[i]);
			}
			
		}
		
	}
	

	
}
