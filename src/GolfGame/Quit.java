/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */
package GolfGame;

/*Purpose of this class: 
 * It is to allow for skipping a round by a user
 */

public class Quit {
	
	//skipRound method that accepts int i
	public void skipRound(int i) {
		//Adds one to i, forcing the loop to skip next round;
		i = i++;
		System.out.println("Okay! You skipped the round");
		}
	
	
}
