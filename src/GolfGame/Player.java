/*Name: Victor Nikhil Antony
*NetID: vantony
*Assignment: Project #2
*MW 1400-1515
*TA Name: Michael Henry
*I did not collaborate with anyone on this assignment
 */

package GolfGame;

/*Summary of Class's Function:
 * Allows for creation of a Player
 */


//Creates public class Player
public class Player {
	
	//Declares variables
	private String name;
	private int[] score;
	
	//Creates constructor
	public Player(String name, int[] score) {
		this.name = name;
		this.score = score;
	}
	
	//Generates getters and setters
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}
	
	public void scoring(int i, int x) {
		score[i] = x;
	}

	//Method to print out the score array of each user
	public void printScore() {
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

